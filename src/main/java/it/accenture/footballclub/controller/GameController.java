package it.accenture.footballclub.controller;


import it.accenture.footballclub.dto.GameDTO;
import it.accenture.footballclub.mapstruct.AnnouncementMapper;
import it.accenture.footballclub.mapstruct.GameMapper;
import it.accenture.footballclub.model.Announcement;
import it.accenture.footballclub.model.Game;
import it.accenture.footballclub.service.AbstractGameService;
import it.accenture.footballclub.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
@RequestMapping("games")
public class GameController {

    private AbstractGameService gameService;

    @Autowired
    public GameController(AbstractGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<?> getGames(@RequestParam(required = false) String startDate,
                                                      @RequestParam(required = false) String endDate) {
        Iterable<Game> gameList = null;
        try {
            if (startDate != null && endDate != null) {
                gameList = gameService.findByGameDateBetween(LocalDate.parse(startDate), LocalDate.parse(endDate));
            } else if(startDate != null && endDate == null) {
                LocalDate sd = LocalDate.parse(startDate);
                gameList = gameService.findByGameDateBetween(sd, sd.plusDays(1));
            } else if(startDate == null && endDate != null) {
                LocalDate ed = LocalDate.parse(endDate);
                gameList = gameService.findByGameDateBetween(ed, ed.plusDays(1));
            } else {
                gameList = gameService.getAll();
            }
            var GameDtos = StreamSupport.stream(gameList.spliterator(), false).map(GameMapper.INSTANCE::fromGame).toList();
            return ResponseEntity.ok(GameDtos);
        } catch (DateTimeParseException e) {
            return ResponseEntity.badRequest().body("Data format is wrong: it must be 'yyyy-mm-dd'!");
        }
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Game> game = gameService.findById(id);
        if(game.isPresent()) {
            return ResponseEntity.ok().body(GameMapper.INSTANCE.fromGame(game.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}

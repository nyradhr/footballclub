package it.accenture.footballclub.controller;


import it.accenture.footballclub.dto.GameDTO;
import it.accenture.footballclub.mapstruct.GameMapper;
import it.accenture.footballclub.model.Game;
import it.accenture.footballclub.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.stream.StreamSupport;

@RestController
//@CrossOrigin
@RequestMapping("game")
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<Iterable<GameDTO>> getGames(@RequestParam(required = false) LocalDate startDate,
                                                      @RequestParam(required = false) LocalDate endDate) {
        Iterable<Game> gameList = null;
        if(startDate != null && endDate != null) {
            gameList = gameService.findByGameDateBetween(startDate, endDate);
        } else {
            gameList = gameService.getAll();
        }
        var GameDtos = StreamSupport.stream(gameList.spliterator(), false).map(GameMapper.INSTANCE::fromGame).toList();
        return ResponseEntity.ok(GameDtos);
    }

}

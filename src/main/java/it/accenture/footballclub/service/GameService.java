package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Game;
import it.accenture.footballclub.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class GameService extends CrudService<Game, Long, GameRepository> implements AbstractGameService{

    public GameService(GameRepository repo) {
        super(repo, Game.class);
    }

    public Iterable<Game> findByGameDateBetween(LocalDate startDate, LocalDate endDate) {
        return repo.findByGameDateBetween(startDate, endDate);
    }

    /*public Iterable<Game> findByGameDate(LocalDate date) {
        System.out.println(date);
        return repo.findByGameDate(date);
    }*/
}

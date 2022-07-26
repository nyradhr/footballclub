package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Game;
import it.accenture.footballclub.repository.GameRepository;

import java.time.LocalDate;

public class GameService extends CrudService<Game, Long, GameRepository>{

    public GameService(GameRepository repo) {
        super(repo, Game.class);
    }

    public Iterable<Game> findByDateBetween(LocalDate startDate, LocalDate endDate) {
        return repo.findByDateBetween(startDate, endDate);

    }
}

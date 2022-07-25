package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Game;
import it.accenture.footballclub.repository.GameRepository;

public class GameService extends CrudService<Game, Long, GameRepository>{

    public GameService(GameRepository repo) {
        super(repo, Game.class);
    }

    public Iterable<Game> findByStartDateAndEndDate() {
        return repo.findByStartDateAndEndDate();
    }
}

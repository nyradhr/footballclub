package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Game;

import java.time.LocalDate;

public interface AbstractGameService extends AbstractCrudService<Game,Long>{

    Iterable<Game> findByGameDateBetween(LocalDate startDate, LocalDate endDate);

    //Iterable<Game> findByGameDate(LocalDate date);
}

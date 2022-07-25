package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.GameDTO;

import it.accenture.footballclub.model.Game;
import org.mapstruct.factory.Mappers;

public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);
    GameDTO fromGame(Game g);
    Game toGame(GameDTO gDTO);

}

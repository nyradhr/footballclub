package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.GameDTO;

import org.mapstruct.factory.Mappers;

public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);
    GameDTO fromGame(GameMapper g);
    GameMapper toFeedback (GameMapper gDTO);

}

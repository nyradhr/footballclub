package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.TicketDTO;
import it.accenture.footballclub.model.Ticket;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
    @Mapping(target = "gameId", source = "game.id")
    @Mapping(target = "", source = "")
    TicketDTO fromFeedback (Ticket t);
    @Mapping(target = "game.id", source = "gameId")
    Ticket toFeedback (Ticket tDTO);
}

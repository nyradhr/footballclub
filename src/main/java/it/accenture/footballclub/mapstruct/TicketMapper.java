package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.TicketDTO;
import it.accenture.footballclub.model.Ticket;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
    @Mapping(target = "gameId", source = "game.id")
    @Mapping(target = "opposingTeam", source = "game.opposingTeam")
    @Mapping(target = "stadium", source = "game.stadium")
    @Mapping(target = "date", source = "game.date")
    TicketDTO fromTicket (Ticket t);
    @Mapping(target = "game.id", source = "gameId")
    @Mapping(target = "game.opposingTeam", source = "opposingTeam")
    @Mapping(target = "game.stadium", source = "stadium")
    @Mapping(target = "game.date", source = "date")
    Ticket toTicket (TicketDTO tDTO);
}
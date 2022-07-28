package it.accenture.footballclub.dto;

import it.accenture.footballclub.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private long id;
    private long gameId;
    private String opposingTeam;
    private String stadium;
    private String gameDate;
    private Integer seatNumber;
    private double ticketCost;
    private String type;
    private String buyer;
    private String recipient;
}

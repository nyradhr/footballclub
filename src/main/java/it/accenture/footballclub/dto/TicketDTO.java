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
    private long game;
    private int seat;
    private double ticketCoast;
    private String type;
    private String buyer;
    private String recipient;
}

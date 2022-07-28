package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Ticket;
import it.accenture.footballclub.repository.TicketRepository;

public class TicketService extends CrudService<Ticket, Long, TicketRepository> implements AbstractTicketService{
    public TicketService(TicketRepository repo) {
        super(repo, Ticket.class);
    }
}

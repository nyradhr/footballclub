package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Ticket;
import it.accenture.footballclub.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService extends CrudService<Ticket, Long, TicketRepository> implements AbstractTicketService{
    public TicketService(TicketRepository repo) {
        super(repo, Ticket.class);
    }

    @Override
    public Iterable<Ticket> findByRecipient(String recipient) {
        return repo.findByRecipient(recipient);
    }
}

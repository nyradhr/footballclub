package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Ticket;
import java.util.List;


public interface AbstractTicketService extends AbstractCrudService<Ticket,Long>{
   Iterable<Ticket> findByRecipient(String recipient);
   }


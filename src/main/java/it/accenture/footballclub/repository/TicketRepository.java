package it.accenture.footballclub.repository;

import it.accenture.footballclub.model.Ticket;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jpa")
public interface TicketRepository extends JpaRepository<Ticket, Long> {
 public Iterable<Ticket> findByRecipient(String recipient);
}

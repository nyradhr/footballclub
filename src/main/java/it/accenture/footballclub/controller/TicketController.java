package it.accenture.footballclub.controller;

import it.accenture.footballclub.mapstruct.TicketMapper;
import it.accenture.footballclub.model.Ticket;
import it.accenture.footballclub.service.AbstractTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
@RequestMapping("tickets")
public class TicketController {

    private AbstractTicketService ticketService;

    @Autowired
    public TicketController(AbstractTicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public ResponseEntity<?> getTickets(@RequestParam(required = false) String recipient) {
        Iterable<Ticket> ticketList = null;
        if(recipient != null) {
            //strings saved in db are all uppercase
            ticketList = ticketService.findByRecipient(recipient.toUpperCase());
        } else {
            ticketList = ticketService.getAll();
        }
        var ticketDtos = StreamSupport.stream(ticketList.spliterator(), false).map(TicketMapper.INSTANCE::fromTicket).toList();
        return ResponseEntity.ok(ticketDtos);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Ticket> ticket = ticketService.findById(id);
        if(ticket.isPresent()) {
            return ResponseEntity.ok().body(TicketMapper.INSTANCE.fromTicket(ticket.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}

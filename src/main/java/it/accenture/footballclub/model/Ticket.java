package it.accenture.footballclub.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKET")
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "GAME")
    private Long gameId;
    @Column(name = "SEAT")
    private int seatNumber;
    @Column(name = "COST")
    private double cost;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "BUYER")
    private String buyer;
    @Column(name = "RECIPIENT")
    private String recipient;
}

package it.accenture.footballclub.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKET")
public class Ticket implements WithId<Long> {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "GAME", referencedColumnName = "ID")
    private Game game;
    @Column(name = "SEAT")
    private Integer seatNumber;
    @Column(name = "COST")
    private double cost;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "BUYER")
    private String buyer;
    @Column(name = "RECIPIENT")
    private String recipient;

}

package it.accenture.footballclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GAME")
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "OPPOSING_TEAM")
    private String opposingTeam;
    @Column(name = "STADIUM")
    private String stadium;
    @Column(name = "DATE")
    private LocalDate date;
    @Column(name = "GALLERY_TICKETS")
    private int galleryTickets;
    @Column(name = "STAND_TICKETS")
    private int standTickets;
    @Column(name = "SOLD_TICKETS")
    private int soldTickets;
    @Column(name = "GALLERY_COST")
    private double galleryCost;
    @Column(name = "STAND_COST")
    private double standCost;
    @Column(name = "CANCELED")
    private boolean canceled;
}

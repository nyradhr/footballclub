package it.accenture.footballclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GAME")
public class Game implements WithId<Long> {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "OPPOSING_TEAM")
    private String opposingTeam;
    @Column(name = "STADIUM")
    private String stadium;
    @Column(name = "GAME_DATE")
    private LocalDate gameDate;
    @Column(name = "GALLERY_TICKETS")
    private int galleryTickets;
    @Column(name = "STAND_TICKETS")
    private int standTickets;
    @Column(name = "SOLD_STAND_TICKETS")
    private int soldStandTickets;
    @Column(name = "SOLD_GALLERY_TICKETS")
    private int soldGalleryTickets;
    @Column(name = "GALLERY_COST")
    private double galleryCost;
    @Column(name = "STAND_COST")
    private double standCost;
    @Column(name = "OUR_SCORE")
    private Integer ourScore;
    @Column(name = "OPPOSING_SCORE")
    private Integer opposingScore;
    @Column(name = "CANCELED")
    private boolean cancelled;

}

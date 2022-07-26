package it.accenture.footballclub.dto;
import it.accenture.footballclub.model.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private long id;
    private String opposingTeam;
    private String stadium;
    private String date;
    private int galleryTickets;
    private int standTickets;
    private int soldStandTickets;
    private int soldGalleryTickets;
    private double galleryCost;
    private double standCost;
    private boolean cancelled;
    private Integer ourScore;
    private Integer opposingScore;
}

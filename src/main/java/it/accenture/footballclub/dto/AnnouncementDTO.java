package it.accenture.footballclub.dto;
import it.accenture.footballclub.model.Announcement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnnouncementDTO {
    private long id;
    private String content;
    private String imgAddress;
    private int score;
    private String title;
}

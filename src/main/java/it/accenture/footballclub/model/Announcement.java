package it.accenture.footballclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ANNOUNCEMENT")
public class Announcement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "IMG_ADDRESS")
    private int imgAddress;
    @Column(name = "SCORE")
    private int score;

    @OneToMany(mappedBy = "announcement")
    private List<Feedback> feedback;
}

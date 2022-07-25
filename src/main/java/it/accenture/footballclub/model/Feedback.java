package it.accenture.footballclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEEDBACK")
public class Feedback implements WithId<Long> {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "AUTHOR")
    private String author;
    @ManyToOne
    @JoinColumn(name = "ANNOUNCEMENT", referencedColumnName = "ID")
    private Announcement announcement;
    @Column(name = "SCORE")
    private int score;
    @Column(name = "REPLY_TO")
    private Long replyTo;
}

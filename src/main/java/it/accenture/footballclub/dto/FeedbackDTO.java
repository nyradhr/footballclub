package it.accenture.footballclub.dto;
import it.accenture.footballclub.model.Feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {
    private long id;
    private long announcement;
    private String author;
    private String content;
    private long replyTO;
}

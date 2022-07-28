package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Announcement;
import it.accenture.footballclub.model.Feedback;
import it.accenture.footballclub.repository.AnnouncementRepository;
import it.accenture.footballclub.repository.FeedbackRepository;

public class FeedbackService extends CrudService<Feedback, Long, FeedbackRepository> implements AbstractFeedbackService{
    public FeedbackService(FeedbackRepository repo) {
        super(repo, Feedback.class);
    }
}

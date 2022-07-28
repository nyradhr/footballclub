package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Announcement;
import it.accenture.footballclub.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService extends CrudService<Announcement, Long, AnnouncementRepository> implements AbstractAnnouncementService{

    public AnnouncementService(AnnouncementRepository repo) {
        super(repo, Announcement.class);
    }

}

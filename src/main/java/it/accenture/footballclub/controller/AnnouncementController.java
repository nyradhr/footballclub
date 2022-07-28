package it.accenture.footballclub.controller;

import it.accenture.footballclub.mapstruct.AnnouncementMapper;
import it.accenture.footballclub.model.Announcement;
import it.accenture.footballclub.service.AbstractAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
@RequestMapping("announcements")
public class AnnouncementController {

    private AbstractAnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AbstractAnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping
    public ResponseEntity<?> getAnnouncements() {
        Iterable<Announcement> announcementList = null;
        announcementList = announcementService.getAll();
        var announcementDtos = StreamSupport.stream(announcementList.spliterator(), false).map(AnnouncementMapper.INSTANCE::fromAnnouncement).toList();
        return ResponseEntity.ok(announcementDtos);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Announcement> announcement = announcementService.findById(id);
        if(announcement.isPresent()) {
            return ResponseEntity.ok().body(AnnouncementMapper.INSTANCE.fromAnnouncement(announcement.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}

package it.accenture.footballclub.controller;

import it.accenture.footballclub.mapstruct.FeedbackMapper;
import it.accenture.footballclub.model.Feedback;
import it.accenture.footballclub.service.AbstractFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
@RequestMapping("feedbacks")
public class FeedbackController {

    private AbstractFeedbackService feedbackService;

    @Autowired
    public FeedbackController(AbstractFeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public ResponseEntity<?> getFeedback() {
        Iterable<Feedback> feedbackList = null;
        feedbackList = feedbackService.getAll();
        var feedbackDtos = StreamSupport.stream(feedbackList.spliterator(), false).map(FeedbackMapper.INSTANCE::fromFeedback).toList();
        return ResponseEntity.ok(feedbackDtos);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Feedback> feedback = feedbackService.findById(id);
        if(feedback.isPresent()) {
            return ResponseEntity.ok().body(FeedbackMapper.INSTANCE.fromFeedback(feedback.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}


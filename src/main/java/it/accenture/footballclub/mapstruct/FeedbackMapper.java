package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.AnnouncementDTO;
import it.accenture.footballclub.dto.FeedbackDTO;
import it.accenture.footballclub.model.Announcement;
import it.accenture.footballclub.model.Feedback;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FeedbackMapper {
    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);
    @Mapping(target = "announcement", source = "announcement.id")
    FeedbackDTO fromFeedback(Feedback f);
    @Mapping(target = "announcement.id", source = "announcement")
    Feedback toFeedback(FeedbackDTO fDTO);
}

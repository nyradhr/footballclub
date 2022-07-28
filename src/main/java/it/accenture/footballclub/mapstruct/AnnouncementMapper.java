package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.AnnouncementDTO;
import it.accenture.footballclub.model.Announcement;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnnouncementMapper {
    AnnouncementMapper INSTANCE = Mappers.getMapper(AnnouncementMapper.class);
    AnnouncementDTO fromAnnouncement(Announcement c);
    Announcement toAnnouncement(AnnouncementDTO aDTO);
}

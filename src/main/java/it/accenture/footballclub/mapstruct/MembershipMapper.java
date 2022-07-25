package it.accenture.footballclub.mapstruct;

import it.accenture.footballclub.dto.MembershipDTO;
import it.accenture.footballclub.model.Membership;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface MembershipMapper {
    MembershipMapper INSTANCE = Mappers.getMapper(MembershipMapper.class);
    MembershipDTO fromMembership(Membership m);
    Membership toMembership(Membership mDTO);
}

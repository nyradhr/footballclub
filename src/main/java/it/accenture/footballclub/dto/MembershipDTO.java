package it.accenture.footballclub.dto;

import it.accenture.footballclub.model.Membership;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MembershipDTO {
    private long id;
    private String startDate;
    private String endDate;
    private String buyer;
    private String recipient;
    private double membershipCoast;
}

package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Membership;
import it.accenture.footballclub.repository.MembershipRepository;
import org.springframework.stereotype.Service;

@Service
public class MembershipService extends CrudService<Membership, Long, MembershipRepository> implements AbstractMembershipService {
    public MembershipService(MembershipRepository repo) {
        super(repo, Membership.class);
    }
}

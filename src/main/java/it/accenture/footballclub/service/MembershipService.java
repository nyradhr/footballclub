package it.accenture.footballclub.service;

import it.accenture.footballclub.model.Membership;
import it.accenture.footballclub.repository.MembershipRepository;

public class MembershipService extends CrudService<Membership, Long, MembershipRepository> implements AbstractMembershipService {
    public MembershipService(MembershipRepository repo) {
        super(repo, Membership.class);
    }
}

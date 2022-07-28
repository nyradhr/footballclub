package it.accenture.footballclub.controller;

import it.accenture.footballclub.mapstruct.MembershipMapper;
import it.accenture.footballclub.model.Membership;
import it.accenture.footballclub.service.AbstractMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
@RequestMapping("memberships")
public class MembershipController {

    private AbstractMembershipService membershipService;

    @Autowired
    public MembershipController(AbstractMembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping
    public ResponseEntity<?> getMembership() {
        Iterable<Membership> membershipList = null;
        membershipList = membershipService.getAll();
        var membershipDtos = StreamSupport.stream(membershipList.spliterator(), false).map(MembershipMapper.INSTANCE::fromMembership).toList();
        return ResponseEntity.ok(membershipDtos);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Membership> membership = membershipService.findById(id);
        if(membership.isPresent()) {
            return ResponseEntity.ok().body(MembershipMapper.INSTANCE.fromMembership(membership.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}

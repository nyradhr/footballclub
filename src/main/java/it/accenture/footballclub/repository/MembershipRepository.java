package it.accenture.footballclub.repository;

import it.accenture.footballclub.model.Membership;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jpa")
public interface MembershipRepository extends JpaRepository<Membership, Long> {


}

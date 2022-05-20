package com.maplr.testhockeygame.persistence.repositories;

import com.maplr.testhockeygame.persistence.models.TeamMember;
import com.maplr.testhockeygame.persistence.models.TeamMemberKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember, TeamMemberKey> {
}

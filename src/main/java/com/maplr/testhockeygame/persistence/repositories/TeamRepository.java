package com.maplr.testhockeygame.persistence.repositories;

import com.maplr.testhockeygame.persistence.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}

package com.maplr.testhockeygame.persistence.repositories;

import com.maplr.testhockeygame.persistence.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}

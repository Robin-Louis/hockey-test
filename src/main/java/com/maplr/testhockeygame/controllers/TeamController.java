package com.maplr.testhockeygame.controllers;

import com.maplr.testhockeygame.converters.PlayerConverter;
import com.maplr.testhockeygame.converters.TeamConverter;
import com.maplr.testhockeygame.dto.PlayerDTO;
import com.maplr.testhockeygame.dto.TeamDTO;
import com.maplr.testhockeygame.persistence.models.Player;
import com.maplr.testhockeygame.persistence.models.Team;
import com.maplr.testhockeygame.persistence.repositories.PlayerRepository;
import com.maplr.testhockeygame.persistence.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/team")
public class TeamController {

    TeamRepository teamRepository;

    PlayerRepository playerRepository;

    @Autowired
    public TeamController(TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    @GetMapping("/{year}")
    public TeamDTO getTeamByYear(@PathVariable("year") Long year) {
        return TeamConverter.toDto(teamRepository.findTeamByYear(year));
    }

    @PostMapping("/{year}")
    public ResponseEntity<PlayerDTO> addPlayer(@PathVariable("year") Long year, @RequestBody PlayerDTO player) {
        Team teamByYear = teamRepository.findTeamByYear(year);
        Player playerEntity = PlayerConverter.toEntity(player);
        playerRepository.save(playerEntity);
        teamByYear.players().add(playerEntity);
        teamRepository.save(teamByYear);
        return ResponseEntity.status(HttpStatus.CREATED).body(PlayerConverter.toDto(playerEntity));
    }
}

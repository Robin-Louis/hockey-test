package com.maplr.testhockeygame.controllers;

import com.maplr.testhockeygame.converters.PlayerConverter;
import com.maplr.testhockeygame.persistence.models.Player;
import com.maplr.testhockeygame.persistence.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/player")
public class PlayerController {

    PlayerRepository playerRepository;

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PutMapping("/captain/{id}")
    public ResponseEntity addPlayer(@PathVariable("id") Long id) {
        Optional<Player> byId = playerRepository.findById(id);
        Player player = byId.get();
        player.isCaptain(true);
        player = playerRepository.save(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(PlayerConverter.toDto(player));
    }
}

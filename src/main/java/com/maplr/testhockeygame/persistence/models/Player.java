package com.maplr.testhockeygame.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Accessors(fluent = true)
@Getter @Setter @NoArgsConstructor
@Table(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastName;

    private Long number;

    private String position;

    private boolean isCaptain;

    @ManyToMany(mappedBy = "players")
    private Set<Team> teams = new HashSet<>();
}

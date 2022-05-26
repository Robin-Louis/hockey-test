package com.maplr.testhockeygame.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "TEAM_MEMBER")
public class TeamMember {

    @EmbeddedId
    TeamMemberKey id;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @MapsId("teamId")
    @JoinColumn(name = "team_id")
    private Team team;

    private Long number;

    private Position position;

    private Boolean isCaptain;

    public TeamMember(TeamMemberKey id, Player player, Team team, Long number, Position position, Boolean isCaptain) {
        this.id = id;
        this.player = player;
        this.team = team;
        this.number = number;
        this.position = position;
        this.isCaptain = isCaptain;
    }

    @Override public String toString() {
        return "TeamMember{" +
                "id=" + id +
                ", player=" + player +
                ", team=" + team +
                ", number=" + number +
                ", position=" + position +
                ", isCaptain=" + isCaptain +
                '}';
    }
}

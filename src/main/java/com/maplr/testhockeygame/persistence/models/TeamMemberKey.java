package com.maplr.testhockeygame.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter @Setter @NoArgsConstructor
public class TeamMemberKey implements Serializable {
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "team_id")
    private Long teamId;

    public TeamMemberKey(Long playerId, Long teamId) {
        this.playerId = playerId;
        this.teamId = teamId;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TeamMemberKey that = (TeamMemberKey) o;
        return Objects.equals(playerId, that.playerId) && Objects.equals(teamId, that.teamId);
    }

    @Override public int hashCode() {
        return Objects.hash(playerId, teamId);
    }
}

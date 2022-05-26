package com.maplr.testhockeygame.converters;

import com.maplr.testhockeygame.dto.PlayerDTO;
import com.maplr.testhockeygame.dto.TeamDTO;
import com.maplr.testhockeygame.persistence.models.Player;
import com.maplr.testhockeygame.persistence.models.Team;

import java.util.Set;
import java.util.stream.Collectors;

public class TeamConverter {
    public static TeamDTO toDto(Team in) {
        Set<PlayerDTO> players = in.players().stream().map(PlayerConverter::toDto).collect(Collectors.toSet());
        TeamDTO out = new TeamDTO()
                .id(in.id())
                .year(in.year())
                .coach(in.coach())
                .players(players);
        return out;
    }

    public static Team toEntity(TeamDTO in) {
        Set<Player> players = in.players().stream().map(PlayerConverter::toEntity).collect(Collectors.toSet());
        Team out = new Team()
                .year(in.year())
                .coach(in.coach())
                .players(players);
        return out;
    }
}

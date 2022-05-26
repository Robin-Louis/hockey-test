package com.maplr.testhockeygame.converters;

import com.maplr.testhockeygame.dto.PlayerDTO;
import com.maplr.testhockeygame.persistence.models.Player;

public class PlayerConverter {
    public static PlayerDTO toDto(Player in) {
        PlayerDTO out = new PlayerDTO()
                .id(in.id())
                .name(in.name())
                .lastName(in.lastName())
                .number(in.number())
                .position(in.position());
        if (in.isCaptain()) {
            out.isCaptain(true);
        }
        return out;
    }

    public static Player toEntity(PlayerDTO in) {
        Player out = new Player()
                .name(in.name())
                .lastName(in.lastName())
                .number(in.number())
                .isCaptain(in.isCaptain())
                .position(in.position());
        return out;
    }
}

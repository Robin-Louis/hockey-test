package com.maplr.testhockeygame.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor
public class Team {

    @Id @GeneratedValue
    private Long id;

    private String coach;

    private Long year;

    @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    private Set<TeamMember> players;

    public Team(String coach, Long year) {
        this.coach = coach;
        this.year = year;
    }

    @Override public String toString() {
        return "Team{" +
                "id=" + id +
                ", coach='" + coach + '\'' +
                ", year=" + year +
                ", players=" + players +
                '}';
    }
}

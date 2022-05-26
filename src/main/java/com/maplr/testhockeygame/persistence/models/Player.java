package com.maplr.testhockeygame.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "PLAYER")
public class Player {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String lastName;

    @OneToMany(mappedBy = "team")
    private Set<TeamMember> teams;

    public Player(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teams=" + teams +
                '}';
    }
}

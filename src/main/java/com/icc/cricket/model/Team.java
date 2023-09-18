package com.icc.cricket.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private String country;
    private boolean active;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team teams = (Team) o;
        return id == teams.id && Objects.equals(name, teams.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}



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
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;
    private String teamName;
    private int ranking;
    private String country;
    private String countryCode;
    private boolean active;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team teams = (Team) o;
        return teamId == teams.teamId && Objects.equals(teamName, teams.teamName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(teamId, teamName);
    }
}



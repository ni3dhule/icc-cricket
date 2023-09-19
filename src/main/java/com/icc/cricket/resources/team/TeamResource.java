package com.icc.cricket.resources.team;

import com.icc.cricket.model.team.Team;
import lombok.*;

import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeamResource {
    private int id;
    private String name;
    private String code;
    private String country;
    private boolean active;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamResource teams = (TeamResource) o;
        return id == teams.id && Objects.equals(name, teams.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Team toTeam() {
        Team team =new Team();
        team.setId(this.id);
        team.setName(this.name);
        team.setCode(this.code);
        team.setCountry(this.country);
        team.setActive(this.active);
        return team;
    }

}

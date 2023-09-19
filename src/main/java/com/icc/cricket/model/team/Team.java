package com.icc.cricket.model.team;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_teams", uniqueConstraints = { @UniqueConstraint(name = "UK_icc_teams_name_code", columnNames =
        {"name", "code"}) })
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "country")
    private String country;
    @Column(name = "is_active")
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

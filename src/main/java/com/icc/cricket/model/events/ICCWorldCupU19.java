package com.icc.cricket.model.events;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "icc_world_cup_u19")
public class ICCWorldCupU19 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int worldCupId;
    private int year;
    private String hostingCountry;
    private int totalTeams;
    private int totalMatches;
}

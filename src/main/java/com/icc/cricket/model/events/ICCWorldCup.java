package com.icc.cricket.model.events;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "icc_world_cup")
public class ICCWorldCup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int worldCupId;
    private int year;
    private String hostingCountry;
    private int totalTeams;
    private int totalMatches;
}

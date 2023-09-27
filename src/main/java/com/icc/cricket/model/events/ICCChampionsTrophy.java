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
@Table(name = "icc_champions_trophy")
public class ICCChampionsTrophy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int championsTrophyId;
    private int year;
    private String hostingCountry;
    private int totalTeams;
    private int totalMatches;
}

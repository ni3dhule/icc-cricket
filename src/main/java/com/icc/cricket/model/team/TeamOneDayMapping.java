package com.icc.cricket.model.team;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_team_one_day_mapping")
public class TeamOneDayMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int teamId;
    private int totalMatchesPlayed;
    private int totalMatchesWon;
    private int totalMatchesLost;
    private int totalMatchesDrew;
    private int highestScore;
    private int lowestScore;
    private int highestScoreAgainstTeamId;
    private int lowestScoreAgainstTeamId;
    private int highestScoreChased;
    private int highestScoreChasedAgainstTeamId;
}

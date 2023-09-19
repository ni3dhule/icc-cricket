package com.icc.cricket.model.player;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_player_test_mapping")
public class PlayerTestMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int playerId;
    private int totalMatchesPlayed;
    private int totalFifties;
    private int totalCenturies;
    private int totalRuns;
    private float average;
    private int bestScore;
    private int bestScoreAgainstTeamId;
    private int totalManOfTheMatch;
    private String bestBowling;
    private int totalWicketsTaken;
    private float economy;
    private int totalFiveWickets;
    private boolean retired;
    private Date careerStartDate;
    private Date retirementDate;
}

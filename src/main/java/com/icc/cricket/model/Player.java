package com.icc.cricket.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int teamId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private boolean retired;
    private Date careerStartDate;
    private Date retirementDate;
}

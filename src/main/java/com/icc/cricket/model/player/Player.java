package com.icc.cricket.model.player;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
    private String middleName;
    private String nickName;
    private String gender;
    private String role;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dob;
    private boolean retired;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date careerStartDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date retirementDate;
}

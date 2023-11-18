package com.icc.cricket.model.events;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "asia_cup")
public class AsiaCup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int asiaCupId;
    private List<Host> hosts;
    private int numberOfTeams;
    private String administrator;
    private int format;
    private int year;

}

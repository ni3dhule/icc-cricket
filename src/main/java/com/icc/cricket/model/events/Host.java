package com.icc.cricket.model.events;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "icc_world_cup")
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hostId;
    private String hostName;
    private boolean active;
}

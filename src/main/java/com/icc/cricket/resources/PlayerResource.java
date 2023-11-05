package com.icc.cricket.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icc.cricket.model.player.Player;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlayerResource {
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
    private Date debutOn;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date retiredOn;

    public Player toPlayer() {
        Player player = new Player();
        player.setId(this.id);
        player.setTeamId(this.teamId);
        player.setFirstName(this.firstName);
        player.setMiddleName(this.middleName);
        player.setLastName(this.lastName);
        player.setGender(this.gender);
        player.setDob(this.dob);
        player.setRole(this.role);
        player.setNickName(this.nickName);
        player.setRetired(this.retired);
        player.setDebutOn(this.debutOn);
        player.setRetiredOn(this.retiredOn);
        return player;
    }
}

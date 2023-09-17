package com.icc.cricket.controller;

import com.icc.cricket.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/teams/")
public class ICCTeamController {

    @GetMapping("status")
    public String serviceStatus() {
        return "ICC App Service is up and running ...";
    }

    @GetMapping("teams")
    public List<Team> getTeams() {
        return null;
    }

}

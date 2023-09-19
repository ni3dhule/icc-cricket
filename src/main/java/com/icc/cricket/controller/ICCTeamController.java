package com.icc.cricket.controller;

import com.icc.cricket.model.team.Team;
import com.icc.cricket.resources.team.TeamResource;
import com.icc.cricket.services.ICCTeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/teams/")
public class ICCTeamController {
    private ICCTeamService iccTeamService;
    public ICCTeamController(ICCTeamService iccTeamService) {
        this.iccTeamService = iccTeamService;
    }
    @GetMapping("status")
    public String serviceStatus() {
        return "ICC App Service is up and running ...";
    }

    @GetMapping("teams")
    public List<Team> getTeams() {
        return iccTeamService.getTeams();
    }

    @PostMapping("team")
    public Team saveTeams(@RequestBody TeamResource resource) {
        return iccTeamService.saveTeam(resource.toTeam());
    }

    @PutMapping("team/{teamId}")
    public Team updateTeams(@PathVariable("teamId") int teamId, @RequestBody TeamResource resource) {
        resource.setId(teamId);
        return iccTeamService.updateTeam(resource.toTeam());
    }

    @PatchMapping("team/{teamId}")
    public Team updateTeamsPatch(@PathVariable("teamId") int teamId, @RequestBody TeamResource resource) {
        resource.setId(teamId);
        return iccTeamService.updateTeam(resource.toTeam());
    }

    @PostMapping("teams")
    public List<Team> createAllTeams(@RequestBody List<Team> teams)  {
        return iccTeamService.createAllTeams(teams);
    }

}

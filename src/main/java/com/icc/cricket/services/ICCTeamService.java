package com.icc.cricket.services;

import com.icc.cricket.model.team.Team;
import com.icc.cricket.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICCTeamService {
    private TeamRepository teamRepository;

    public ICCTeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> createAllTeams(List<Team> teams) {
        return teamRepository.saveAll(teams);
    }
}

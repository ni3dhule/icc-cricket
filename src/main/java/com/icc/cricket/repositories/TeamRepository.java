package com.icc.cricket.repositories;

import com.icc.cricket.model.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}

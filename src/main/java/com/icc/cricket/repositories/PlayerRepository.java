package com.icc.cricket.repositories;

import com.icc.cricket.model.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}

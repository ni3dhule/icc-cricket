package com.icc.cricket.services;

import com.icc.cricket.model.player.Player;
import com.icc.cricket.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ICCPlayerService {

    private PlayerRepository playerRepository;

    public ICCPlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayer() {
        return playerRepository.findAll();
    }
    public Optional<Player> getPlayerById(int playerId){
        return playerRepository.findById(playerId);
    }

    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }
}

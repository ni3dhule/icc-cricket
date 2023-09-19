package com.icc.cricket.controller;

import com.icc.cricket.model.player.Player;
import com.icc.cricket.services.ICCPlayerService;
import com.icc.cricket.services.ICCTeamService;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/players/")
public class ICCPlayerController {

    private ICCPlayerService iccPlayerService;
    public ICCPlayerController(ICCPlayerService iccPlayerService){
        this.iccPlayerService = iccPlayerService;
    }

    @GetMapping("players")
    public List<Player> getAllPlayers(){
        return iccPlayerService.getAllPlayer();
    }

    @PostMapping("player")
    public Player savePlayer(@RequestBody Player player){
        return iccPlayerService.savePlayer(player);
    }

    @PutMapping("player/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
        player.setId(playerId);
        return iccPlayerService.updatePlayer(player);
    }

}

package com.tuckermillerdev.webapi.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @RequestMapping("/player/{id}")
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/player/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPlayer(@RequestBody Player player, @PathVariable String password) {
        if (password.equals("Tucker")) {
            playerService.addPlayer(player);
        }
    }

    @RequestMapping("/.well-known/acme-challenge/G_fjWti8HOnL89GsEiBXWAGm1ykk-CbWmG2mk1c9u1g")
    public String stupid() {
        return "G_fjWti8HOnL89GsEiBXWAGm1ykk-CbWmG2mk1c9u1g.N-xDBSqw70n3lM7BmAB-ebX0TUe13rWD4k96JICcsP8";
    }
}
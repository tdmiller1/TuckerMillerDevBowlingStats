package com.tuckermillerdev.webapi.players;

import com.tuckermillerdev.webapi.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;
    // @Autowired
    // RecordService recordService;

    //Working
    @RequestMapping("/players")
    public List<Players> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    //Working
    @RequestMapping("/players/{username}")
    public Players getPlayer(@PathVariable String username) {
        return playerService.getPlayer(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/players/{password}/addGame", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addGame(@RequestBody Game game, @PathVariable String password) {
        if (password.equals("Tucker")) {
            String username = game.getUsername();
            playerService.addGame(game,username);
        }
    }

    // Working
    @RequestMapping(method = RequestMethod.POST, value = "/players/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPlayer(@RequestBody Players player, @PathVariable String password) {
        if (password.equals("Tucker")) {
            try{
                if(playerService.getPlayer(player.getUsername()) == null){
                playerService.addPlayer(player);
            }else{System.out.println("Duplicate Username");}
            }catch(Exception e){
                System.out.println(e);
                playerService.addPlayer(player);
            }
            
        }
    }

    // Working
    @RequestMapping(method = RequestMethod.PUT, value = "/players/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePlayer(@RequestBody Players player, @PathVariable String password) {
        if (password.equals("Tucker")) {
            try{
                playerService.updatePlayer(player);
            }catch(Exception e){
                System.out.println(e);
                playerService.updatePlayer(player);
            }
            
        }
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/players/{username}")
    public void deleteRecord(@PathVariable String username){
        playerService.deletePlayer(username);
    }

    // Working
    @RequestMapping("/.well-known/acme-challenge/G_fjWti8HOnL89GsEiBXWAGm1ykk-CbWmG2mk1c9u1g")
    public String stupid() {
        return "G_fjWti8HOnL89GsEiBXWAGm1ykk-CbWmG2mk1c9u1g.N-xDBSqw70n3lM7BmAB-ebX0TUe13rWD4k96JICcsP8";
    }
}
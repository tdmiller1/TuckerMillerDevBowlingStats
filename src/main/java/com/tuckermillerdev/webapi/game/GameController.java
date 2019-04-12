package com.tuckermillerdev.webapi.game;

import com.tuckermillerdev.webapi.history.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping("/Game")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @RequestMapping("/player/{id}/Game")
    public Game getGame(@PathVariable String id){
        return gameService.getGame(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/Game/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addGame(@RequestBody Game Game, @PathVariable String password){
        if(password.equals("Tucker")) {
            gameService.addGame(Game);
        }
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/Game/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateGame(@RequestBody Game Game, @PathVariable String id){
        gameService.updateGame(id, Game);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/Game/{id}")
    public void deleteGame(@PathVariable String id){
        gameService.deleteGame(id);
    }
}

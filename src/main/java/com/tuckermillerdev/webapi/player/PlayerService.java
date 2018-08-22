package com.tuckermillerdev.webapi.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService{

    @Autowired
    private PlayerRepositoy playerRepositoy;

    public List<Player> getAllPlayers(){
        List<Player> players = new ArrayList<>();
        //Method Reference lambda references
        playerRepositoy.findAll().forEach(players::add);
        return players;
    }

    public Player getPlayer(String id){
        return playerRepositoy.findById(id).get();
    }

    public void addPlayer(Player player){
        playerRepositoy.save(player);
    }

    public void updatePlayer(Player player){
        playerRepositoy.save(player);
    }

    public void deletePlayer(String id){
        playerRepositoy.deleteById(id);
    }
}
package com.tuckermillerdev.webapi.players;

import com.tuckermillerdev.webapi.Game;
import com.tuckermillerdev.webapi.record.*;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService{

    @Autowired
    private PlayerRepositoy playerRepositoy;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private RecordService recordService;

    public List<Players> getAllPlayers(){
        List<Players> players = new ArrayList<>();
        //Method Reference lambda references
        playerRepositoy.findAll().forEach(players::add);
        return players;
    }

    public Players getPlayer(String id){
        return playerRepositoy.findById(id).get();
    }

    public void addPlayer(Players player){
        List<Game> games = Collections.<Game>emptyList();
        System.out.println("Test");
        Record record = new Record(player.getUsername(), games );
        recordService.addRecord(record);
        playerRepositoy.save(player);
    }

    public void addGame(Game game, String username){
        Record record = recordService.getRecord(username);
        System.out.println(record.getUsername());
        game.setId(record.getGames().size()+1);
        record.addGame(game);
        recordService.updateRecord(username, record);
        setStats(record, username);
    }

    public void updatePlayer(Players player){
        playerRepositoy.save(player);
    }

    public void deletePlayer(String id){
        playerRepositoy.deleteById(id);
    }

    private void setStats(Record record, String id){
        int sum = 0;
        Players player = playerService.getPlayer(id);
        int max = player.getMax();
        int gameCount = record.getGames().size();
        for(Game game: record.getGames()){
            sum = sum + game.getScore();
            if(game.getScore() > max){
                player.setMax(game.getScore());
            }
        }
        player.setAverage(sum/gameCount);
        playerRepositoy.save(player);
    }
}
package com.tuckermillerdev.webapi.record;
import com.tuckermillerdev.webapi.Game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Record {

    @Id
    private String username;
    private List<Game> games;

    public Record(String username, List<Game> games) {
        this.username = username;
        this.games = games;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public void addGame(Game game){
        this.games.add(game);
    }
}

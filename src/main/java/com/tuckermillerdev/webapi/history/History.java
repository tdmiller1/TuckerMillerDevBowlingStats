package com.tuckermillerdev.webapi.history;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class History {

    @Id
    private String id;
    private String playerName;
    private List<Game> games;

    public History(String id, String playerName, List<Game> games) {
        this.id = id;
        this.playerName = playerName;
        this.games = games;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}

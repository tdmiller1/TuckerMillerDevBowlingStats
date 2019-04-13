package com.tuckermillerdev.webapi.players;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Players {

    @Id
    private String username;
    private String password;
    private String playerName;
    private int average;
    private int max;

    public Players(String username, String password, String playerName, int average, int max) {
        this.username = username;
        this.password = password;
        this.playerName = playerName;
        this.average = average;
        this.max = max;
    }

    // public Players(String username, String password, String playerName, int... optional) {
    //     this.username = username;
    //     this.password = password;
    //     this.playerName = playerName;
    //     this.average = optional[0];
    //     this.max = optional[1];
    // }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAverage() {
        return this.average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

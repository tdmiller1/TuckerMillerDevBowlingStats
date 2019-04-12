package com.tuckermillerdev.webapi.game;

import java.util.Date;

public class Game {

    private String id;
    private String playerName;
    private int score;
    private Date date;

    public Game(String id, String playerName, int score, Date date) {
        this.id = id;
        this.playerName = playerName;
        this.score = score;
        this.date = date;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

}

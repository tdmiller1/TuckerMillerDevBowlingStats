package com.tuckermillerdev.webapi.archive;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Game {


    @JsonProperty("id")
    private String id;
    @JsonProperty("playerName") private String playerName;
    @JsonProperty("score")private int score;
    @JsonProperty("date")private Date date;

    @JsonCreator
    public Game(@JsonProperty("id") String id,@JsonProperty("playerName") String playerName,@JsonProperty("score") int score,@JsonProperty("date") Date date) {
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

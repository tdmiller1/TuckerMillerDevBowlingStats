package com.tuckermillerdev.webapi;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Game {

    @Id
    private int id;
    private String username;
    private int score;
    private Date date;

    public Game(String username, int score, Date date) {
        this.username = username;
        this.score = score;
        this.date = date;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPlayerName(String username) {
        this.username = username;
    }

}

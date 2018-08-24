package com.tuckermillerdev.webapi.archive;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Archive {


    @Id @JsonProperty("id") private String id;

    @JsonProperty("playername") private String playername;
    @JsonProperty("games") private List<Game> games;

    @JsonCreator
    public Archive(@JsonProperty("id") String id,@JsonProperty("playername") String playername, @JsonProperty("games") List<Game> games) {
        this.id = id;
        this.playername = playername;
        this.games = games;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}

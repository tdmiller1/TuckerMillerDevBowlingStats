package com.tuckermillerdev.webapi.game;

import com.tuckermillerdev.webapi.history.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        List<Game> games = new ArrayList<>();
        //Method Reference lambda references
        gameRepository.findAll().forEach(games::add);
        return games;
    }

    public Game getGame(String id){
        return gameRepository.findById(id).get();
    }

    public void addGame(Game game){
        gameRepository.save(game);
    }

    public void updateGame(String id, Game game){
        gameRepository.save(game);
    }

    public void deleteGame(String id){
        gameRepository.deleteById(id);
    }
}
package com.tuckermillerdev.webapi.archive;

import com.tuckermillerdev.webapi.player.Player;

import com.tuckermillerdev.webapi.player.PlayerRepositoy;
import com.tuckermillerdev.webapi.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArchiveService {

    @Autowired
    private ArchiveRepository archiveRepository;

    public List<Archive> getAllPlayers(){
        List<Archive> archives = new ArrayList<>();
        //Method Reference lambda references
        archiveRepository.findAll().forEach(archives::add);
        return archives;
    }

    public Archive getArchive(String id){
        Archive archive = archiveRepository.findById(id).get();
        return archive;
    }

    public void addArchive(Archive archive){
        archiveRepository.save(archive);
    }

    public void addGame(Game game, String id){
        Player player = playerService.getPlayer(id);
        Archive archive = getArchive(id);

        List<Game> games = archive.getGames();
        game.setId(String.valueOf(games.size()+1));
        games.add(game);

        archive.setGames(games);

        int newAverage = calculateAverage(archive.getGames());
        player.setAverage(newAverage);

        if (game.getScore() > player.getMax()){
            player.setMax(game.getScore());
        }
        playerService.updatePlayer(player);
        archiveRepository.save(archive);
    }

    public void updateArchive(String id, Archive archive){
        archiveRepository.save(archive);
    }

    public void deleteArchive(String id){
        archiveRepository.deleteById(id);
    }

    @Autowired
    PlayerService playerService;


    public int calculateAverage(List<Game> games){
        int average = 0;
        for (Game game : games){
            average = average + game.getScore();
        }
        return average / games.size();
    }
}
package com.tuckermillerdev.webapi.archive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArchiveController {

    @Autowired
    ArchiveService archiveService;

    @RequestMapping("/archives")
    public List<Archive> getAllArchives(){
        return archiveService.getAllPlayers();
    }

    @RequestMapping("/player/{id}/archive")
    public Archive getArchive(@PathVariable String id){
        return archiveService.getArchive(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/archive", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addArchive(@RequestBody Archive archive){
        archiveService.addArchive(archive);
    }

    @RequestMapping(method=RequestMethod.POST, value="/player/{id}/game", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addGame(@RequestBody Game game, @PathVariable String id){
        archiveService.addGame(game,id);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/player/{id}/archive", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateArchive(@RequestBody Archive player, @PathVariable String id){
        archiveService.updateArchive(id, player);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/player/{id}/archive")
    public void deleteArchive(@PathVariable String id){
        archiveService.deleteArchive(id);
    }
}

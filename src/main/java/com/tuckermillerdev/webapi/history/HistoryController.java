package com.tuckermillerdev.webapi.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    HistoryService historyService;

    @RequestMapping("/history")
    public List<History> getAllHistories(){
        return historyService.getAllHistories();
    }

    @RequestMapping("/player/{id}/history")
    public History getHistory(@PathVariable String id){
        return historyService.getHistory(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/history/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPlayer(@RequestBody History history, @PathVariable String password){
        if(password.equals("Tucker")) {
            historyService.addPlayer(history);
        }
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/history/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateHistory(@RequestBody History history, @PathVariable String id){
        historyService.updateHistory(id, history);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/history/{id}")
    public void deleteHistory(@PathVariable String id){
        historyService.deleteHistory(id);
    }
}

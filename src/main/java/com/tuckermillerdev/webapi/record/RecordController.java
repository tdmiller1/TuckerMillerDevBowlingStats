package com.tuckermillerdev.webapi.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

    @RequestMapping("/record")
    public List<Record> getAllHistories(){
        return recordService.getAllHistories();
    }

    @RequestMapping("/record/{username}")
    public Record getRecord(@PathVariable String username){
        return recordService.getRecord(username);
    }

    @RequestMapping(method=RequestMethod.POST, value="/record/{password}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPlayer(@RequestBody Record record, @PathVariable String password){
        if(password.equals("Tucker")) {
            recordService.addRecord(record);
        }
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/record/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateRecord(@RequestBody Record record, @PathVariable String id){
        recordService.updateRecord(id, record);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/record/{id}")
    public void deleteRecord(@PathVariable String id){
        recordService.deleteRecord(id);
    }
}

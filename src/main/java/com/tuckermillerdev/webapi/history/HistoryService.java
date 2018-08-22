package com.tuckermillerdev.webapi.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<History> getAllHistories(){
        List<History> histories = new ArrayList<>();
        //Method Reference lambda references
        historyRepository.findAll().forEach(histories::add);
        return histories;
    }

    public History getHistory(String id){
        return historyRepository.findById(id).get();
    }

    public void addPlayer(History history){
        historyRepository.save(history);
    }

    public void updateHistory(String id, History history){
        historyRepository.save(history);
    }

    public void deleteHistory(String id){
        historyRepository.deleteById(id);
    }
}
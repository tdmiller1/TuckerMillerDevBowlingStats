package com.tuckermillerdev.webapi.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<Record> getAllHistories(){
        List<Record> histories = new ArrayList<>();
        //Method Reference lambda references
        recordRepository.findAll().forEach(histories::add);
        return histories;
    }

    public Record getRecord(String id){
        return recordRepository.findById(id).get();
    }

    public void addRecord(Record record){
        recordRepository.save(record);
    }

    public void updateRecord(String id, Record record){
        recordRepository.save(record);
    }

    public void deleteRecord(String id){
        recordRepository.deleteById(id);
    }
}
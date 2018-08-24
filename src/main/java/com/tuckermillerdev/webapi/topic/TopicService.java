package com.tuckermillerdev.webapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService{

//    @Autowired
//    private TopicRepository topicRepository;
//
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("1", "CS224","BigO"),
//            new Topic("2", "CS224","Dynamic Programming")
//    ));
//
//    public List<Topic> getAllTopics(){
//        List<Topic> topics = new ArrayList<>();
//        //Method Reference lambda references
//        topicRepository.findAll().forEach(topics::add);
//        return topics;
//    }
//
//    public Topic getTopic(String id){
//        return topicRepository.findById(id).get();
//    }
//
//    public void addTopic(Topic topic){
//        topicRepository.save(topic);
//    }
//
//    public void updateTopic(String id, Topic topic){
//        topicRepository.save(topic);
//    }
//
//    public void deleteTopic(String id){
//        topicRepository.deleteById(id);
//    }
}
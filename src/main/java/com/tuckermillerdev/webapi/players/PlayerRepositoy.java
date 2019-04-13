package com.tuckermillerdev.webapi.players;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlayerRepositoy extends MongoRepository<Players,String> {

}

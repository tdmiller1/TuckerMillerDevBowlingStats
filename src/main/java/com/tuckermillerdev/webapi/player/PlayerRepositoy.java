package com.tuckermillerdev.webapi.player;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlayerRepositoy extends MongoRepository<Player,String> {

}

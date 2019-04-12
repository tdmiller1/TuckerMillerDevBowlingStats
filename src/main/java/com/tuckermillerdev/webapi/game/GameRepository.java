package com.tuckermillerdev.webapi.game;
import com.tuckermillerdev.webapi.history.Game;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface GameRepository extends MongoRepository<Game,String> {

}

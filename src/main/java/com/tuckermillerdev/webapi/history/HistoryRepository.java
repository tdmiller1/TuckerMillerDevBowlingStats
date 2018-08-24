package com.tuckermillerdev.webapi.history;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface HistoryRepository extends MongoRepository<History,String> {

}

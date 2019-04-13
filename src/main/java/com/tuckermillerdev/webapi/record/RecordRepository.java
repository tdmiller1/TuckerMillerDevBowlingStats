package com.tuckermillerdev.webapi.record;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RecordRepository extends MongoRepository<Record,String> {

}

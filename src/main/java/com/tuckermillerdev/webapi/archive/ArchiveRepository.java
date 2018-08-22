package com.tuckermillerdev.webapi.archive;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ArchiveRepository extends MongoRepository<Archive,String> {

}

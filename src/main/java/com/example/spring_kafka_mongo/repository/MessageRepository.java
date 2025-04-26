package com.example.spring_kafka_mongo.repository;

import com.example.spring_kafka_mongo.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}

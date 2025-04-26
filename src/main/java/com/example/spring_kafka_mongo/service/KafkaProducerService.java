package com.example.spring_kafka_mongo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "messages";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}

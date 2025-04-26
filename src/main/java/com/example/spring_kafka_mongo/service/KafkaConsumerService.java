package com.example.spring_kafka_mongo.service;

import com.example.spring_kafka_mongo.model.Message;
import com.example.spring_kafka_mongo.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final MessageRepository messageRepository;

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consume(String messageContent) {
        Message message = Message.builder()
                                  .content(messageContent)
                                  .build();
        messageRepository.save(message);
    }
}

package com.example.spring_kafka_mongo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.spring_kafka_mongo.service.KafkaProducerService;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducerService producerService;

    @PostMapping
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "Mensagem enviada para o Kafka!";
    }
}

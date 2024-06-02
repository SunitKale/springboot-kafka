package com.spring.kafka.kafka;

import com.spring.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javatopic_json", groupId = "myGroup2")
    public void consume(User user) {
        LOGGER.info(String.format("JSON Message received: %s", user.toString()));
    }
}

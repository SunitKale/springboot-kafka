package com.spring.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic springKafkaTopic() {
        return TopicBuilder.name("javatopic")
                .build();
    }

    @Bean
    public NewTopic springKafkaJsonTopic() {
        return TopicBuilder.name("javatopic_json")
                .build();
    }
}

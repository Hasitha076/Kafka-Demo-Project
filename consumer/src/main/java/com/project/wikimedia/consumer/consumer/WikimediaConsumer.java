package com.project.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "quickstart-events", groupId = "group_id")
    public void consume(String message) {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}

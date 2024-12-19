package com.project.wikimedia.producer.producer;

import com.project.wikimedia.producer.model.Wikimedia;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<Wikimedia, Wikimedia> kafkaTemplate;

    public void sendMessage(Wikimedia message) {
        log.info(String.format("#### -> Producing message -> %s", message));
        kafkaTemplate.send("quickstart-events", message);
    }
}

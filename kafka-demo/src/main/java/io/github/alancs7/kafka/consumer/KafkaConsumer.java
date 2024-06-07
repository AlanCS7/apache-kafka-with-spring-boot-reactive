package io.github.alancs7.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info("Consuming the message from kafka topic:: {}", message);
    }
}

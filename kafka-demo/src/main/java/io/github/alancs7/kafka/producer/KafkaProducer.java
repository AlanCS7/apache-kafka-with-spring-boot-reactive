package io.github.alancs7.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void senMessage(String message) {
        log.info("Sending message to kafka topic:: {}", message);
        kafkaTemplate.send("kafka", message);
    }
}

package wingersworldwide.dome.studioman.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StudioManKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(StudioManKafkaConsumer.class);
    private static final String TOPIC = "topic_studioman";

    @KafkaListener(topics = "topic_studioman", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}

package wingersworldwide.dome.studioman.application.web.rest;

import wingersworldwide.dome.studioman.application.service.StudioManKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/studio-man-kafka")
public class StudioManKafkaResource {

    private final Logger log = LoggerFactory.getLogger(StudioManKafkaResource.class);

    private StudioManKafkaProducer kafkaProducer;

    public StudioManKafkaResource(StudioManKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}

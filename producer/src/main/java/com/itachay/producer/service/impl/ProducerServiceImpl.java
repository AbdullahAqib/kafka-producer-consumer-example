package com.itachay.producer.service.impl;

import com.itachay.producer.service.ProducerService;
import com.itachay.producer.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void publishUserInformation (UserDTO userDTO) {
        Message<UserDTO> message = MessageBuilder
                .withPayload(userDTO)
                .setHeader(KafkaHeaders.TOPIC, "user-topic")
                .build();
        kafkaTemplate.send(message);
    }
}

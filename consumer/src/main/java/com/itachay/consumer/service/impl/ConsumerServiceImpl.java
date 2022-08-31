package com.itachay.consumer.service.impl;

import com.itachay.consumer.service.ConsumerService;
import com.itachay.consumer.service.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    @KafkaListener(topics = "user-topic", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeUserInformation (UserDTO userDTO) {
        log.info("Consumed User information: " + userDTO);
    }

}

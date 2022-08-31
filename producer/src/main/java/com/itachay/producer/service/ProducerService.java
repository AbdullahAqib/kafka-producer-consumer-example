package com.itachay.producer.service;

import com.itachay.producer.service.dto.UserDTO;

public interface ProducerService {
    void publishUserInformation(UserDTO userDTO);
}

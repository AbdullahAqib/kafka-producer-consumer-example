package com.itachay.consumer.service.dto;

import lombok.*;
import java.time.Instant;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String phone;
    private Instant dateOfJoining = Instant.now();
}
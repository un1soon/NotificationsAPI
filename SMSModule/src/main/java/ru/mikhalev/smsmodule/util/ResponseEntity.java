package ru.mikhalev.smsmodule.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseEntity {
    private String message;
    private LocalDateTime timestamp;
}

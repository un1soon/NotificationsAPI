package ru.mikhalev.emailmodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.emailmodule.util.ResponseEntity;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class EmailController {

    @PostMapping("/email")
    public ResponseEntity sendEmail() {
        log.info("email was sent");
        return ResponseEntity
                .builder()
                .message("email was sent")
                .timestamp(LocalDateTime.now())
                .build();
    }
}

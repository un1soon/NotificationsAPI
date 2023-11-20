package ru.mikhalev.pushmodule.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.pushmodule.util.ResponseEntity;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class PushController {

    @PostMapping("/push")
    public ResponseEntity sendPush() {
        log.info("push was sent");
        return ResponseEntity
                .builder()
                .message("push was sent")
                .timestamp(LocalDateTime.now())
                .build();
    }
}

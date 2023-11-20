package ru.mikhalev.smsmodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikhalev.smsmodule.util.ResponseEntity;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class SMSController {

    @PostMapping("/sms")
    public ResponseEntity sendSMS() {
        log.info("sms was sent");
        return ResponseEntity
                .builder()
                .message("sms was sent")
                .timestamp(LocalDateTime.now())
                .build();
    }
}

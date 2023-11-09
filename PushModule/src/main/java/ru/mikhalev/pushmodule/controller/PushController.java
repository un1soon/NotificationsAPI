package ru.mikhalev.pushmodule.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PushController {

    @GetMapping("/push")
    public String sendPush() {
        log.info("push was sent");
        return "push was sent";
    }
}

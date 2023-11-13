package ru.mikhalev.pushmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PushModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(PushModuleApplication.class, args);
    }
}

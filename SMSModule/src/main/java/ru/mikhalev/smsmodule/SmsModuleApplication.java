package ru.mikhalev.smsmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsModuleApplication.class, args);
    }

}

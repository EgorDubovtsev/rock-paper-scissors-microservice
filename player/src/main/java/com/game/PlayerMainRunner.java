package com.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayerMainRunner {
    public static void main(String[] args) {
        SpringApplication.run(PlayerMainRunner.class,args);
    }
}

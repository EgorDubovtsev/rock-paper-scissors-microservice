package org.buss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = com.game.api.PlayerAPI.class)
public class GameStarter {
    public static void main(String[] args) {
        SpringApplication.run(GameStarter.class,args);
    }
}

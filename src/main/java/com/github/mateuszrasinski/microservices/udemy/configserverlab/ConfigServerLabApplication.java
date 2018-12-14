package com.github.mateuszrasinski.microservices.udemy.configserverlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerLabApplication.class, args);
    }

}

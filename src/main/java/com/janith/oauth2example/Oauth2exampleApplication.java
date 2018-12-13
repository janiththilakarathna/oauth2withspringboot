package com.janith.oauth2example;

import com.janith.oauth2example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Oauth2exampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2exampleApplication.class, args);
    }
}

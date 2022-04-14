package com.toyopilgrim.springbootkeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class SpringbootKeycloakApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKeycloakApplication.class, args);
    }

}

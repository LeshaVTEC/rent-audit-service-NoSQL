package org.alexey.rentauditservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// TODO Unit Tests
// TODO Swagger Open API
// TODO replace Russian messages with English
// TODO remove all comments
// TODO remove all empty lines, align spaces


@SpringBootApplication
@EnableMongoRepositories
public class RentAuditServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentAuditServiceApplication.class, args);
    }
}

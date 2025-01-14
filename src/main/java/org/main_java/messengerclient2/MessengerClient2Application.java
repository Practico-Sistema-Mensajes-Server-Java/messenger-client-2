package org.main_java.messengerclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessengerClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(MessengerClient2Application.class, args);
    }

}

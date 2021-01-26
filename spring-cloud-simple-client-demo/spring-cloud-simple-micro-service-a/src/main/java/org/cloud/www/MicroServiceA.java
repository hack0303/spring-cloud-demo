package org.cloud.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceA {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceA.class, args);
    }

}

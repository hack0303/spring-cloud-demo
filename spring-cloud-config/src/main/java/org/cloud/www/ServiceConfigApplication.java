package org.cloud.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_nested_keys_in_vault
 *
 * ref:https://blog.csdn.net/wo18237095579/article/details/83623262?utm_medium=distribute.pc_relevant.none-task-blog-searchFromBaidu-2.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-searchFromBaidu-2.control
 * */
@SpringBootApplication
@EnableConfigServer
public class ServiceConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigApplication.class, args);
    }

}
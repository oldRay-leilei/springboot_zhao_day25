package com.zhaofengyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServerApplication.class);
    }
}

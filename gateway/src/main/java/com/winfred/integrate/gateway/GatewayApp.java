package com.winfred.integrate.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * @author winfred958
 */
@SpringBootApplication
@EnableWebFlux
@EnableDiscoveryClient
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GatewayApp.class);
        springApplication.run(args);
    }
}

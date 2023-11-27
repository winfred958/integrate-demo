package com.winfred.integrate.warehouse;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
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
@EnableDubbo(scanBasePackages = "com.winfred.integrate.warehouse.service")
public class WarehouseApp {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(WarehouseApp.class);
    springApplication.run(args);
  }
}

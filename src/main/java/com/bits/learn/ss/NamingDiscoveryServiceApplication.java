package com.bits.learn.ss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingDiscoveryServiceApplication.class, args);
	}

}

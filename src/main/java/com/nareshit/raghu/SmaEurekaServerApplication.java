package com.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmaEurekaServerApplication.class, args);
	}

}

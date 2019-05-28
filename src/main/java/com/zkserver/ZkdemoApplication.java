package com.zkserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkdemoApplication.class, args);
	}

}

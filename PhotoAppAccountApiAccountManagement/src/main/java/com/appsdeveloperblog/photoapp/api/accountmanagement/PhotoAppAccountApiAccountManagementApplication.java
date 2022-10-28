package com.appsdeveloperblog.photoapp.api.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppAccountApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppAccountApiAccountManagementApplication.class, args);
	}

}

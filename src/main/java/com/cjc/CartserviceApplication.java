package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cjc.dao")
@EnableFeignClients("com.cjc.proxy")
public class CartserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartserviceApplication.class, args);
	}

}

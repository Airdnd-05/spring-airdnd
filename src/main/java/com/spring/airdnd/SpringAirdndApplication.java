package com.spring.airdnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringAirdndApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAirdndApplication.class, args);
	}

}

package com.fabrosft.onetoone;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class OneToOneApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Started the Spring Application");
	}
}

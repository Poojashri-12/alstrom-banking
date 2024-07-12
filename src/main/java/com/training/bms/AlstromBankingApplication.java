package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlstromBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlstromBankingApplication.class, args);
		System.out.println("Alstrom banking app is initialized");
		System.out.println("Alstrom banking app is executed");
	}

}

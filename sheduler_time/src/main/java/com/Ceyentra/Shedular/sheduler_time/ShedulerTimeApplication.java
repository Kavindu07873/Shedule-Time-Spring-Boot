package com.Ceyentra.Shedular.sheduler_time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShedulerTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedulerTimeApplication.class, args);
	}

}

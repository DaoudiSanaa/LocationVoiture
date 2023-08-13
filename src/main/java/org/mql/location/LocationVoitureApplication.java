package org.mql.location;

import org.mql.location.dao.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocationVoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationVoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CarRepository cr ) {
		return args ->{
			//System.err.println(cr.findAll());
		};
		
	};
	
}

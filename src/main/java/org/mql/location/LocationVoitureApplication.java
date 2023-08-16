package org.mql.location;

import java.util.Date;

import org.mql.location.business.LocationService;
import org.mql.location.dao.CarRepository;
import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.mql.location.models.RentCar;
import org.mql.location.models.User;
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
	CommandLineRunner start(CarRepository cr, LocationService services) {
		return args ->{
			 /*Car c = new Car("ar25kh", "mac", "2001", "red", "200dh", "mac.jsp", 5);
	            Car c1 = new Car("ar284", "pool", "2004", "bleu", "207dh", "mas.jsp", 5);
	            Car c2 = new Car("agk12h", "hdsl", "2012", "blac", "250dh", "pgac.jsp", 6);
	            services.saveCar(c);
	            services.saveCar(c1); 
	            services.saveCar(c2);*/
			
			/*Client cl1= new Client("cin1", "hiij", "oualid","hjjsjkksjbbd", "054485239", "f", "45 sale","25");
			Client cl2= new Client("cin2", "hiij", "oualid","hjjsjkksjbbd", "054485239", "f", "45 sale","25");
			Client cl3= new Client("cin3", "hiij", "oualid","hjjsjkksjbbd", "054485239", "f", "45 sale","25");
			services.saveClient(cl1);
			services.saveClient(cl2);
			services.saveClient(cl3);*/
			/*Car c = cr.findById("ar25kh").get();
			Client cl = services.client("cin1").get();
			Date d1 = new Date("14/08/2023");
			Date d2 = new Date("14/08/2023");
			
			
			RentCar rent  = new RentCar(c, cl, "500.0",d1, d2);
			System.err.println(services.reservationClient("cin1"));*/
			//services.saveReservation(rent);
			//System.err.println(services.cars());
			
			/*User user = new User(1, "acha", "acha@gmail.com", "123");
			User user1 = new User(2, "ma", "ma@gmail.com", "123");
			services.addUser(user);
			services.addUser(user1);*/
		};
		
	};
	
	
}

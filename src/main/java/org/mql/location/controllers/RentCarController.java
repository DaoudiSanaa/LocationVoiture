package org.mql.location.controllers;

import java.util.List;


import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
import org.mql.location.models.RentCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rentCars")
@CrossOrigin("*")
public class RentCarController {
	@Autowired
	public LocationService service;
	
	public RentCarController(LocationService service) {
        this.service = service;
    }
	
	@PostMapping
	public RentCar addCar(@RequestBody RentCar rentCar) {
		return service.saveReservation(rentCar);
	}
	@PostMapping("/update")
	public Boolean update(@RequestBody RentCar c1,@RequestBody RentCar c2) {
		
		return service.changeReserv(c1, c2);	 
	}
	
	@GetMapping
	public List<RentCar> getAll() {
		return service.reservations();
	}
	@GetMapping("/{cin}")
	public List<RentCar> getReservationClient(@PathVariable String cin) {
		return service.reservationClient(cin);
	}
	
	@GetMapping("/{matr}")
	public List<RentCar> getReservationCar(@PathVariable String matr) {
		return service.reservationCar(matr);
	}
	@DeleteMapping 
	public RentCar deleteReservation(RentCar rentCar) {
		return service.removeReservation(rentCar);
	}
}

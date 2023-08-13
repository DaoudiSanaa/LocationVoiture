package org.mql.location.controllers;

import java.util.List;


import org.mql.location.business.LocationService;
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
	
	public RentCarController() {
	}
	
	@PostMapping
	public RentCar addCar(@RequestBody RentCar rentCar) {
		return service.saveReservation(rentCar);
	}
	
	@GetMapping
	public List<RentCar> getAll() {
		return service.reservations();
	}
	@GetMapping
	public List<RentCar> getReservationClient(String cin) {
		return service.reservationClient(cin);
	}
	
	@GetMapping
	public List<RentCar> getReservationCar(String matr) {
		return service.reservationClient(matr);
	}
	@DeleteMapping 
	public RentCar deleteReservation(RentCar rentCar) {
		return service.removeReservation(rentCar);
	}
}

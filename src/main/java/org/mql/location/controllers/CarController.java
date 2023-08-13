package org.mql.location.controllers;

import java.util.List;


import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@CrossOrigin("*")
public class CarController {
	@Autowired
	public LocationService service;
	
	public CarController() {
	}
	
	@PostMapping
	public Car addCar(@RequestBody Car car) {
		return service.saveCar(car);
	}
	
	@GetMapping("/{keyword}")
	public List<Car> getCarsByKeyword(@PathVariable String keyword) {   
		return service.cars();
	}
	@GetMapping
	public List<Car> getAll() {
		return service.cars();
	}
}
// https://reqbin.com/
/* 
	public List<Voiture> all();
	public Voiture get(Long id);
	public Voiture post(Voiture v);
	public Voiture put(Voiture v);
	public Voiture delete(Long id);
	public List<Voiture> loadByAgence(long a);
	public ResponseEntity<byte[]> download(long recid);
	public String upload(MultipartFile file, String recid);
 * 
 * 
 * 
*/
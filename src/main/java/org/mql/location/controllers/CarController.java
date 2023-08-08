package org.mql.location.controllers;

import java.util.List;


import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docs")
@CrossOrigin("*")
public class CarController {
	@Autowired
	public LocationService service;
	
	public CarController() {
	}
	
	@GetMapping("/{keyword}")
	public List<Car> getCarsByKeyword(@PathVariable String keyword) {
		return service.cars();
	}
}

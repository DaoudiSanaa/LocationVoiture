package org.mql.location.controllers;

import java.util.List;
import java.util.Optional;

import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
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
@RequestMapping("/cars")
@CrossOrigin("*")
public class CarController {
	@Autowired
	public LocationService service;
	

    @Autowired
    public CarController(LocationService service) {
        this.service = service;
    }
	
	@PostMapping
	public Car addCar(@RequestBody Car car) {
		return service.saveCar(car);
	}
	
	  @PostMapping("/update")
	   public Boolean update(@RequestBody Car c1, @RequestBody Car c2) {
	        return service.modifyCar(c1, c2);
	   }

	
	@GetMapping("/{matricule}")
	public Optional<Car> getCarById(@PathVariable String matricule) {   
		return service.car(matricule);
	}
	@GetMapping
	public List<Car> getAll() {
		return service.cars();
	}

	@DeleteMapping
	public Car deleteReservation(Car car) {
		return service.removeCar(car);
	}

	@DeleteMapping("/{matricule}")
	public Optional<Car> deleteCar(@PathVariable String matricule) {
		service.removeCarByMatricule(matricule);
		return getCarById(matricule);
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
package org.mql.location.controllers;

import java.util.List;
import java.util.Optional;

import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.mql.location.models.RentCar;
import org.mql.location.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
	@Autowired
	public LocationService service;
	
	public UserController(LocationService service) {
        this.service = service;
    }
	
	@GetMapping
	public List<User> getAll() {
		return ((LocationService) service).getAllUsers();
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/{gmail}")
	public User getUserByGmail(@PathVariable String gmail) {   
		return service.getUserByEmail(gmail);
	}
	@PostMapping("/login")
	public User login(@PathVariable String email,@PathVariable String pwd) {   
		return service.login(email, pwd);
	}
}


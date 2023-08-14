package org.mql.location.controllers;

import java.util.List;
import java.util.Optional;

import org.mql.location.business.LocationService;
import org.mql.location.models.Car;
import org.mql.location.models.Client;
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
@RequestMapping("/clients")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	public LocationService service;
	
	public ClientController(LocationService service) {
        this.service = service;
    }
	
	@PostMapping
	public Client addClient(@RequestBody Client c) {
		return service.saveClient(c);
	}
	@PostMapping("/update")
	public Boolean update(@RequestBody Client c1,@RequestBody Client c2) {
		
		return service.modifyClient(c1, c2);	 
	}
	
	
	@GetMapping("/{cin}")
	public Optional<Client> getClientById(@PathVariable String cin) {   
		return service.client(cin);
	}
	
	@GetMapping
	public List<Client> getAll() {
		return service.clients();
	}
	@DeleteMapping 
	public Client deleteClient(Client c) {
		return service.removeClient(c);
	}
}

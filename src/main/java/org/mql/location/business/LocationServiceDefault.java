package org.mql.location.business;

import java.util.List;


import org.mql.location.dao.CarRepository;
import org.mql.location.dao.ClientRepository;
import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceDefault implements LocationService {
	@Autowired
	private CarRepository carRepository;
	private ClientRepository clientRepository;
	
	public LocationServiceDefault() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Car> cars() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}



	@Override
	public Car car(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Boolean deletCar(Car c) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Boolean modifierCar(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Client> clients() {
		
		return clientRepository.findAll();
	}



	@Override
	public Client client(String cin) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

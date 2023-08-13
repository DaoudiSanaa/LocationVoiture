package org.mql.location.business;

import java.util.List;
import java.util.Optional;

import org.mql.location.dao.CarRepository;
import org.mql.location.dao.ClientRepository;
import org.mql.location.dao.RentCarRepository;
import org.mql.location.dao.UserRepository;
import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.mql.location.models.RentCar;
import org.mql.location.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceDefault implements LocationService {
	@Autowired
	private CarRepository carRepository;
	private ClientRepository clientRepository;
	private UserRepository userRepository;
	private RentCarRepository rentCarRepository;
	
	public LocationServiceDefault() {
		
	}

	@Override
	public List<Car> cars() {
	
		return carRepository.findAll();
	}

	@Override
	public Optional<Car> car(String matricule) {
		
		return carRepository.findById(matricule);
	}


	



	@Override
	public void removeCar(Car c) {
		// TODO Auto-generated method stub
		 carRepository.delete(c);
	}



	@Override
	public Boolean modifyCar(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return carRepository.update(c1,c2);
	}



	@Override
	public List<Client> clients() {
		
		return clientRepository.findAll();
	}




	@Override
	public Optional<Client> client(String cin) {
		// TODO Auto-generated method stub
		return clientRepository.findById(cin);
	}



	



	@Override
	public void removeClient(Client c) {
		// TODO Auto-generated method stub
		clientRepository.delete(c);
		
	}



	@Override
	public boolean modifyClient(Client oldClient, Client newClient) {
		// TODO Auto-generated method stub
		return clientRepository.update(oldClient, newClient);
	}



	@Override
	public boolean authentication(User a) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public List<RentCar> reservations() {
		// TODO Auto-generated method stub
		return rentCarRepository.findAll();
	}








	@Override
	public void removeReservation(RentCar r) {
		// TODO Auto-generated method stub
		 rentCarRepository.delete(r);
	}

	@Override
	public void saveCar(Car c) {
		this.carRepository.save(c);
		
	}

	@Override
	public void saveClient(Client a) {
		this.clientRepository.save(a);
	}

	@Override
	public void saveReservation(RentCar a) {
		this.rentCarRepository.save(a);
	}

	@Override
	public List<RentCar> reservationClient(String cin) {
		
		return rentCarRepository.getReservationBycin(cin);
	}

	@Override
	public List<RentCar> reservationCar(String matricule) {
		
		return rentCarRepository.getReservationBymatricule(matricule);
	}

	@Override
	public boolean changeReserv(RentCar oldReservation, RentCar newReservation) {
		// TODO Auto-generated method stub
		return false;
	}




}

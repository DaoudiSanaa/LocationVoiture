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
	public Boolean modifyCar(Car c1,Car c2) { //
		c2.setMatricule(c1.getMatricule());
		return carRepository.save(c2) != null;
	}



	@Override
	public List<Client> clients() {
		
		return clientRepository.findAll();
	}




	@Override
	public Optional<Client> client(String cin) { 
		return clientRepository.findById(cin);
	}



	@Override
	public void removeClient(Client c) {
		// TODO Auto-generated method stub
		clientRepository.delete(c);
		
	}



	@Override
	public boolean modifyClient(Client oldClient, Client newClient) {
		newClient.setCin(oldClient.getCin());
		return clientRepository.save( newClient)!=null;
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
	public Car saveCar(Car c) {
		return this.carRepository.save(c);
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
	public boolean changeReserv(RentCar oldReservation, RentCar newReservation) {
		// TODO Auto-generated method stub
		return false;
	}

@Override
public List<RentCar> reservationClient(String cin) {
	// TODO Auto-generated method stub
	Client c = new Client();
	c.setCin(cin);
	return rentCarRepository.findByClient(c);
}

@Override
public List<RentCar> reservationCar(String matricule) {
	// TODO Auto-generated method stub
	Car c = new Car();
	c.setMatricule(matricule);
	return rentCarRepository.findByCar(c);
}




}

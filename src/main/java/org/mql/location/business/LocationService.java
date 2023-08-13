package org.mql.location.business;

import java.util.List;
import java.util.Optional;

import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.mql.location.models.RentCar;
import org.mql.location.models.User;

public interface LocationService {
	public Car saveCar(Car c);
	public List<Car> cars();
	public Optional<Car> car(String matricule);
	public Car removeCar(Car c);
	public Boolean modifyCar(Car c1,Car c2);
	
	
	public List<Client> clients();
	public Optional<Client> client(String cin);
	public Client saveClient(Client a);
	public Client removeClient(Client c);
	public boolean modifyClient(Client oldClient, Client newClient);
	

	
	public boolean authentication(User a);
	
	public RentCar saveReservation(RentCar a);
	public List<RentCar> reservations();
	public List<RentCar> reservationClient( String cin);
	public List<RentCar> reservationCar( String matricule);
	public boolean changeReserv(RentCar oldReservation, RentCar newReservation);
	public RentCar removeReservation(RentCar r);
	
	
	

}

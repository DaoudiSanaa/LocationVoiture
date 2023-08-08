package org.mql.location.business;

import java.util.List;

import org.mql.location.models.Car;
import org.mql.location.models.Client;

public interface LocationService {

	public List<Car> cars();
	public Car car(String matricule);
	public Boolean deletCar(Car c);
	public Boolean modifierCar(Car c1,Car c2);
	
	
	public List<Client> clients();
	public Client client(String cin);
	
	
	

}

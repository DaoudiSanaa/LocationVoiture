package org.mql.location.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.mql.location.models.Car;
import org.mql.location.models.Client;
import org.mql.location.models.RentCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface RentCarRepository extends JpaRepository<RentCar, Integer>{
	
	    
	    public List<RentCar> findByClient(Client  client);

	   
	    public List<RentCar> findByCar(Car car);
	   

	   
}

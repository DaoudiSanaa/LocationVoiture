package org.mql.location.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.mql.location.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car,String> {
	
	@Query("SELECT c FROM car c WHERE c.name LIKE :keyword% ")
	public List<Car> findByKeyword(String keyword);
	
	 @Modifying
	    @Transactional
	    @Query("UPDATE car u SET   u = c2  WHERE u = c1")
	    Boolean update(Car c1,Car c2);
}

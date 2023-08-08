package org.mql.location.dao;

import java.util.List;

import org.mql.location.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car, Integer> {
	
	@Query("SELECT c FROM car c WHERE c.name LIKE :keyword% ")
	public List<Car> findByKeyword(String keyword);
}

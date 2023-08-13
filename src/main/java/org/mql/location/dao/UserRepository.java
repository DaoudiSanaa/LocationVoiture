package org.mql.location.dao;

import java.util.List;

import org.mql.location.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Car, Integer> {
	
}

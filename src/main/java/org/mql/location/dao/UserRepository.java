package org.mql.location.dao;

import java.util.List;

import org.mql.location.models.Car;
import org.mql.location.models.RentCar;
import org.mql.location.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByGmail(String gmail);
}

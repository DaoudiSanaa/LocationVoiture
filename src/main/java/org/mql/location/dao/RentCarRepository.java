package org.mql.location.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.mql.location.models.Car;
import org.mql.location.models.RentCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface RentCarRepository extends JpaRepository<RentCar, Integer>{
	 @Modifying
	    @Query("DELETE FROM reserv u WHERE u.mail = ?1") //
	    int deletereservation(String mail);

	    @Query("SELECT u FROM reserv u WHERE u.mail = ?1")
	    public List<RentCar> getReservationByMail(String mail);

	    //////// modifier la date de reservation

	    @Modifying
	    @Transactional
	    @Query("UPDATE reserv u SET   u.date = ?1  WHERE u.mail = ?2")
	    void update(String date , String mail);
}

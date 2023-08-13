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

	    @Query("SELECT u FROM rentCar u WHERE u.cin = ?1")
	    public List<RentCar> getReservationBycin(String cin);

	    @Query("SELECT u FROM rentCar u WHERE u.matricule = ?1")
	    public List<RentCar> getReservationBymatricule(String matricule);
	    //////// modifier la date de reservation

	    @Modifying
	    @Transactional
	    @Query("UPDATE rentCar u SET   u.date = ?1  WHERE u.mail = ?2")
	    void update(RentCar r1 , RentCar r2);
	    
}

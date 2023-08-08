package org.mql.location.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RentCar")
@Table(name = "RentCar")
public class RentCar {
    @Id
    private int id_RentCar;
    
    @Column(name = "idCar")
    private int idCar;

    @Column(name = "cinClient")
    private String cinClient;
    
    @Column(name = "tl")
    private String tl;


    @Column(name = "prix")
    private String prixtotal;

    
    @Column(name = "dateReservationCar")
    private String dateReservationCar ;
    
    @Column(name = "dateReturnCar")
    private String dateReturnCar;

	
}

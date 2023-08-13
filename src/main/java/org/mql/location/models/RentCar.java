package org.mql.location.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RentCar")
@Table(name = "RentCar")
public class RentCar {
    @Id
    private int id_RentCar;
    
    @Column(name = "matricule")
    private int matricule;

    @Column(name = "cin")
    private String cin;
    
    @Column(name = "prix")
    private String prixtotal;

    
    @Column(name = "dateReservationCar")
    private Date dateReservationCar ;
    
    @Column(name = "dateReturnCar")
    private Date dateReturnCar;
    
    

	
	public RentCar(int id_RentCar, int matricule, String cin, String prixtotal, Date dateReservationCar,
			Date dateReturnCar) {
		super();
		this.id_RentCar = id_RentCar;
		this.matricule = matricule;
		this.cin = cin;
		this.prixtotal = prixtotal;
		this.dateReservationCar = dateReservationCar;
		this.dateReturnCar = dateReturnCar;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getId_RentCar() {
		return id_RentCar;
	}

	public void setId_RentCar(int id_RentCar) {
		this.id_RentCar = id_RentCar;
	}


	public String getPrixtotal() {
		return prixtotal;
	}

	public void setPrixtotal(String prixtotal) {
		this.prixtotal = prixtotal;
	}

	public Date getDateReservationCar() {
		return dateReservationCar;
	}

	public void setDateReservationCar(Date dateReservationCar) {
		this.dateReservationCar = dateReservationCar;
	}

	public Date getDateReturnCar() {
		return dateReturnCar;
	}

	public void setDateReturnCar(Date dateReturnCar) {
		this.dateReturnCar = dateReturnCar;
	}

	@Override
	public String toString() {
		return "RentCar [id_RentCar=" + id_RentCar + ", matricule=" + matricule + ", cin=" + cin + ", prixtotal="
				+ prixtotal + ", dateReservationCar=" + dateReservationCar + ", dateReturnCar=" + dateReturnCar + "]";
	}
	

	

    
	
}

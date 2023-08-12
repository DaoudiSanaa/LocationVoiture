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
    
    @Column(name = "idCar")
    private int idCar;

    @Column(name = "cinClient")
    private String cinClient;
    
    @Column(name = "prix")
    private String prixtotal;

    
    @Column(name = "dateReservationCar")
    private Date dateReservationCar ;
    
    @Column(name = "dateReturnCar")
    private Date dateReturnCar;
    
    

	public RentCar(int id_RentCar, int idCar, String cinClient, String prixtotal, Date dateReservationCar,
			Date dateReturnCar) {
		super();
		this.id_RentCar = id_RentCar;
		this.idCar = idCar;
		this.cinClient = cinClient;
		this.prixtotal = prixtotal;
		this.dateReservationCar = dateReservationCar;
		this.dateReturnCar = dateReturnCar;
	}

	public int getId_RentCar() {
		return id_RentCar;
	}

	public void setId_RentCar(int id_RentCar) {
		this.id_RentCar = id_RentCar;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public String getCinClient() {
		return cinClient;
	}

	public void setCinClient(String cinClient) {
		this.cinClient = cinClient;
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
		return "RentCar [id_RentCar=" + id_RentCar + ", idCar=" + idCar + ", cinClient=" + cinClient + ", prixtotal="
				+ prixtotal + ", dateReservationCar=" + dateReservationCar + ", dateReturnCar=" + dateReturnCar + "]";
	}

    
	
}

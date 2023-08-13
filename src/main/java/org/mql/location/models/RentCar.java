package org.mql.location.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "RentCar")
@Table(name = "RentCar")
public class RentCar {
    @Id
    private int id_RentCar;
    
    @ManyToOne
	@JoinColumn(name = "Car_Id")
    private Car car;

    @ManyToOne
	@JoinColumn(name = "client_ID")
    private Client client;
    
    @Column(name = "prix")
    private String prixtotal;

    
    @Column(name = "dateReservationCar")
    private Date dateReservationCar ;
    
    @Column(name = "dateReturnCar")
    private Date dateReturnCar;
    public RentCar() {
		// TODO Auto-generated constructor stub
	}
    

	

	
	public RentCar(int id_RentCar, Car car, Client client, String prixtotal, Date dateReservationCar,
			Date dateReturnCar) {
		super();
		this.id_RentCar = id_RentCar;
		this.car = car;
		this.client = client;
		this.prixtotal = prixtotal;
		this.dateReservationCar = dateReservationCar;
		this.dateReturnCar = dateReturnCar;
	}





	public Car getCar() {
		return car;
	}





	public void setCar(Car car) {
		this.car = car;
	}





	public Client getClient() {
		return client;
	}





	public void setClient(Client client) {
		this.client = client;
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
		return "RentCar [id_RentCar=" + id_RentCar + ", car=" + car + ", client=" + client + ", prixtotal=" + prixtotal
				+ ", dateReservationCar=" + dateReservationCar + ", dateReturnCar=" + dateReturnCar + "]";
	}

	

    
	
}

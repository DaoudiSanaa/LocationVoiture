package org.mql.location.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	  
	    @Id
	    private int id;
	    @Column(name = "namecar")
	    private String namecar;

	    @Column(name = "model")
	    private String model;

	    @Column(name = "matricule")
	    private String matricule;

	    @Column(name = "color")
	    private String color;
	    
	    @Column(name = "price")
	    private String price;
	    
	    @Column(name = "nbplace")
	    private int nbplace;
	    
	    @Column(name = "nbplace")
	    private int statut;

	    


		

		public Car(int id, String namecar, String model, String matricule, String color, String price, int nbplace,
				int statut) {
			super();
			this.id = id;
			this.namecar = namecar;
			this.model = model;
			this.matricule = matricule;
			this.color = color;
			this.price = price;
			this.nbplace = nbplace;
			this.statut = statut;
		}


		public int getNbplace() {
			return nbplace;
		}


		public void setNbplace(int nbplace) {
			this.nbplace = nbplace;
		}


		public int getStatut() {
			return statut;
		}


		public void setStatut(int statut) {
			this.statut = statut;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNamecar() {
			return namecar;
		}

		public void setNamecar(String namecar) {
			this.namecar = namecar;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getMatricule() {
			return matricule;
		}

		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}


		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Car [id=" + id + ", namecar=" + namecar + ", model=" + model + ", matricule=" + matricule
					+ ", color=" + color + ", price=" + price + ", nbplace=" + nbplace + "]";
		}
	    
}

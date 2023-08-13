package org.mql.location.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
///@Table(name = "cars")
public class Car {
	  
	    @Id
	    @Column(name = "matricule")
	    private String matricule;
	    @Column(name = "namecar")
	    private String namecar;

	    @Column(name = "model")
	    private String model;

	    @Column(name = "color")
	    private String color;
	    
	    @Column(name = "price")
	    private String price;
		
	    
	    @Column(name = "image")
	    private String image;
	    
	    @Column(name = "nbplace")
	    private int nbplace;
	    
	    public Car() {
			// TODO Auto-generated constructor stub
		}
	    

		public Car(String namecar, String model, String matricule, String color, String price, String image,
				int nbplace) {
			super();
			
			this.namecar = namecar;
			this.model = model;
			this.matricule = matricule;
			this.color = color;
			this.price = price;
			this.image = image;
			this.nbplace = nbplace;
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

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public int getNbplace() {
			return nbplace;
		}

		public void setNbplace(int nbplace) {
			this.nbplace = nbplace;
		}


		@Override
		public String toString() {
			return "Car [ namecar=" + namecar + ", model=" + model + ", matricule=" + matricule
					+ ", color=" + color + ", price=" + price + ", image=" + image + ", nbplace=" + nbplace + "]";
		}
		

   
}

package org.mql.location.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Client")
@Table(name = "Client")
public class Client {
    @Id
    private String cin;

    @Column(name = "name")
    private String name;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "mail")
    private String mail;
    @Column(name = "tl")
    private String tl;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "adress")
    private String adress;
    @Column(name = "age")
    private String age;
    public Client() {
		// TODO Auto-generated constructor stub
	}
    
	public Client(String cin, String name, String prenom, String mail, String tl, String sexe, String adress,
			String age) {
		super();
		this.cin = cin;
		this.name = name;
		this.prenom = prenom;
		this.mail = mail;
		this.tl = tl;
		this.sexe = sexe;
		this.adress = adress;
		this.age = age;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTl() {
		return tl;
	}
	public void setTl(String tl) {
		this.tl = tl;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Client [cin=" + cin + ", name=" + name + ", prenom=" + prenom + ", mail=" + mail + ", tl=" + tl
				+ ", sexe=" + sexe + ", adress=" + adress + ", age=" + age + "]";
	}
   

}
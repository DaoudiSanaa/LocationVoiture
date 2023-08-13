package org.mql.location.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "user")
public class User {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gmail")
    private String gmail;
    @Column(name = "password")
    private String password;
    public User() {
		// TODO Auto-generated constructor stub
	}
    
	public User(int id, String name, String gmail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gmail=" + gmail + ", password=" + password + "]";
	}
	
    
   
}

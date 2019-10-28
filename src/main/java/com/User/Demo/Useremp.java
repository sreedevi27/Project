package com.User.Demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Useremp")
public class Useremp {
	@Id
	@Column(name="id")
	
	private String id;
	@Column(name="name")
    private String name;
    
    @Column(name="zipcode")
    private int zipcode;
    
	//private Country Country;
   // @ManyToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="Locationid")
	//@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
    //@JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
	
  //@ManyToOne
    //@JoinColumn(name="id")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="state_id",insertable = false,updatable = false)
	@Fetch((FetchMode.JOIN))
	private State state;
    
	public Useremp() {
    	
    }
    
   
	public Useremp(String id, String name, State state, int zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.zipcode = zipcode;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}

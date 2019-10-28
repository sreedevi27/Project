package com.User.Demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="userstate")
public class State {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private String id;
	@Column(name="statename")
    private String statename;
    
    public State() {
    	
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public State(String id, String statename) {
		super();
		this.id = id;
		this.statename = statename;
	}
    

}

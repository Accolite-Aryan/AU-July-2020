package main.java.com.hibernate.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name="user")
@Cacheable
public class User {

	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

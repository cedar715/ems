package com.technofacts.ems.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Employee {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long id;
	  
	  private String firstName;
	  
	  private String lastName;
	  
	  @CreationTimestamp
	  private Date createdAt;

	  @UpdateTimestamp
	  private Date updatedAt;

	public Employee(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Employee[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }
}
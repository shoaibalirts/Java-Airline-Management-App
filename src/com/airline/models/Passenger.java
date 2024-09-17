package com.airline.models;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Passenger
 *
 */
@Entity

public class Passenger implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;


	public Passenger() {
		super();
	}   
	@Id // column of Primary key 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Enumerated(EnumType.STRING) // in order to avoid digit in the database, we need string not a digit
	private Gender gender;
	
	@Enumerated(EnumType.STRING) // in order to avoid digit in the database, we need string not a digit
	private FlightClass flightClass;
	
   
}

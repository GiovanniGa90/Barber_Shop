package com.giovannigalatioto.BarberShop2.Entity;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "appointment")
@Data
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointment_id;
	
	@OneToOne
	@JoinColumn( name= "name_client", referencedColumnName = "employee_name")
	private Employee clientName;
	
	private LocalDate date;
	private LocalTime time;
	private String phoneNumber;
	private String email;
	
	

}

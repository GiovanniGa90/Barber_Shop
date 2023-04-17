package com.giovannigalatioto.BarberShop2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//import java.persistence.;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "employee")
@Data
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Column( name= "employee_name", length = 255)
	private String employeename;
	
	@Column(name= "email", length = 255)
	private String email;
	
	@Column(name= "password", length = 255)
	private String password;

}

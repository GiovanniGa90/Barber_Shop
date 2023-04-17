package com.giovannigalatioto.BarberShop2.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDTO {
	
	
	private int employee_id;
	private String employeename;
	private String email;
	private String password;

}

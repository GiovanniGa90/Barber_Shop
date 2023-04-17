package com.giovannigalatioto.BarberShop2.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovannigalatioto.BarberShop2.Entity.Employee;
import com.giovannigalatioto.BarberShop2.Repo.EmployeeRepo;

@Service
public class EmployeeServ {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public Optional<Employee> getByEmail(String email){
		return employeeRepo.findByEmail(email);
	}

}

package com.giovannigalatioto.BarberShop2.Service;


import com.giovannigalatioto.BarberShop2.Dto.EmployeeDTO;
import com.giovannigalatioto.BarberShop2.Dto.LoginDTO;
import com.giovannigalatioto.BarberShop2.response.LoginResponse;



public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);

	LoginResponse loginEmployee(LoginDTO loginDTO);

}

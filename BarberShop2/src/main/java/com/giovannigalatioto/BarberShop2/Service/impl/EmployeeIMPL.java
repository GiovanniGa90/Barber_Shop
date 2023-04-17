package com.giovannigalatioto.BarberShop2.Service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.giovannigalatioto.BarberShop2.Dto.EmployeeDTO;
import com.giovannigalatioto.BarberShop2.Dto.LoginDTO;
import com.giovannigalatioto.BarberShop2.Entity.Employee;
import com.giovannigalatioto.BarberShop2.Repo.EmployeeRepo;
import com.giovannigalatioto.BarberShop2.Service.EmployeeService;
import com.giovannigalatioto.BarberShop2.response.LoginResponse;

import java.util.Optional;


@Service

public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(

                employeeDTO.getEmployee_id(),
                employeeDTO.getEmployeename(),
                employeeDTO.getEmail(),

               this.passwordEncoder.encode(employeeDTO.getPassword())
        );

        employeeRepo.save(employee);

        return employee.getEmployeename();
    }
    EmployeeDTO employeeDTO;

    @Override
    public LoginResponse  loginEmployee(LoginDTO loginDTO) {
        String message = "";
//        Boolean status = true;
        Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail()).get();
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }


    }

}
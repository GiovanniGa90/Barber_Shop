package com.giovannigalatioto.BarberShop2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannigalatioto.BarberShop2.Entity.Appointment;
import com.giovannigalatioto.BarberShop2.Entity.Employee;
import com.giovannigalatioto.BarberShop2.Service.AppointmentService;
import com.giovannigalatioto.BarberShop2.Service.EmployeeServ;
import com.giovannigalatioto.BarberShop2.Service.EmployeeService;


@RestController
@RequestMapping("api/v1/employee")
@CrossOrigin
public class AppointmentController {
	
	@Autowired
	private EmployeeServ employeeServ;
	
	@Autowired
	private AppointmentService appServ;
	
	
	
	@GetMapping("appointment/all")
	public List<Appointment> getAllAppointments() {
		return appServ.getAll();
	}
	
	@GetMapping("/appointment/client_name")
	public List<Appointment> getAllAppointmentsByClientName(@PathVariable Employee name) {
		return appServ.getByClientName(name);
	}
	
	@PostMapping("/save/appointment")
	public Appointment save(@RequestBody Appointment app) {

		Appointment a = new Appointment();
		Employee e = employeeServ.getByEmail(app.getEmail()).get();
		a.setEmail(app.getEmail());
		a.setClientName(e);
		a.setDate(app.getDate());
		a.setTime(app.getTime());
		a.setPhoneNumber(app.getPhoneNumber());
		
		return appServ.save(a);
		
		
		

	}


}

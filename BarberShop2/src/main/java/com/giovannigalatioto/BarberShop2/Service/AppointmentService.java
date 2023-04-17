package com.giovannigalatioto.BarberShop2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovannigalatioto.BarberShop2.Entity.Appointment;
import com.giovannigalatioto.BarberShop2.Entity.Employee;
import com.giovannigalatioto.BarberShop2.Repo.AppointmentRepo;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepo appRepo;
	
	public Appointment save(Appointment a) {
		return appRepo.save(a);
	}
	
	public List<Appointment> getAll(){
		return appRepo.findAll();
	}

	public List<Appointment> getByClientName(Employee name){
		return appRepo.findByClientName(name);
	}
}

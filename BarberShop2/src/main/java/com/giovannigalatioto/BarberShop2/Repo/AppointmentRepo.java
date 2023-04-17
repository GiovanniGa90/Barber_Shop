package com.giovannigalatioto.BarberShop2.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.giovannigalatioto.BarberShop2.Entity.Appointment;
import com.giovannigalatioto.BarberShop2.Entity.Employee;

@EnableJpaRepositories
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
	@Query(nativeQuery = true,
            value = "SELECT * FROM appointment WHERE name_cliente = :name")
	List<Appointment> findByClientName(@Param("name")Employee name);
}

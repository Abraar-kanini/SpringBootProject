package com.example.DoctorPatientDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>  {
	
	
	List<Patient> findAll();


}

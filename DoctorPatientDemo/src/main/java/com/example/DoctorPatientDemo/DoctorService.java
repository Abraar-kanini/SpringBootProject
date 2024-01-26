package com.example.DoctorPatientDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DoctorService {

	
private final DoctorRepository DoctorRepository;
	
@Autowired
	public DoctorService(DoctorRepository DoctorRepository) {
		this.DoctorRepository=DoctorRepository;
	}

public void addProduct(Doctor product) {
    DoctorRepository.save(product);
}
}

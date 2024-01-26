package com.example.DoctorPatientDemo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")

public class PatientController {
	
	
	
	private final PatientRepository PatientRepository;
	private final PatientService PatientService;
	
	
	public PatientController(PatientRepository PatientRepository , PatientService PatientService) {
		this.PatientRepository=PatientRepository;
		this.PatientService=PatientService;
	}
	
	
	 @GetMapping("/all")
	    public ResponseEntity<List<Patient>> getAllDoctor() {
	        List<Patient> allPatients = PatientRepository.findAll();
	        return new ResponseEntity<>(allPatients, HttpStatus.OK);
	    }
	 
	 
	 @PostMapping("/add")
	    public ResponseEntity<String> addNewProduct(@RequestBody Patient Patient) {
		 PatientService.addPatient(Patient);
	        return new ResponseEntity<>("New product added successfully!", HttpStatus.CREATED);
	    }
	 

}

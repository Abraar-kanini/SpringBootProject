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
@RequestMapping("/api/doctors")

public class DoctorController {

	private final DoctorRepository DoctorRepository;
	private final DoctorService DoctorService;
	
	
	public DoctorController(DoctorRepository DoctorRepository , DoctorService DoctorService) {
		this.DoctorRepository=DoctorRepository;
		this.DoctorService=DoctorService;
	}
	
	
	 @GetMapping("/all")
	    public ResponseEntity<List<Doctor>> getAllDoctor() {
	        List<Doctor> allDoctors = DoctorRepository.findAll();
	        return new ResponseEntity<>(allDoctors, HttpStatus.OK);
	    }
	 
	 
	 @PostMapping("/add")
	    public ResponseEntity<String> addNewProduct(@RequestBody Doctor product) {
	        DoctorService.addProduct(product);
	        return new ResponseEntity<>("New product added successfully!", HttpStatus.CREATED);
	    }
	 
	 
	
}

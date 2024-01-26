package com.example.DoctorPatientDemo;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	  @Column(name = "doctorname") 
	    private String doctorname;

	   public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getDoctorspecialist() {
		return doctorspecialist;
	}

	public void setDoctorspecialist(String doctorspecialist) {
		this.doctorspecialist = doctorspecialist;
	}

	public String getDoctorage() {
		return doctorage;
	}

	public void setDoctorage(String doctorage) {
		this.doctorage = doctorage;
	}

	@Column(name = "doctorspecialist") 
	    private String doctorspecialist;

	    @Column(name = "doctorage") 
	    private String doctorage;

}
package com.example.DoctorPatientDemo;






import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		 private Long id;
		  @Column(name = "patientname") 
		    private String patientname;

		   @Column(name = "patientage") 
		    private String patientage;

		    @Column(name = "disease") 
		    private String disease;
		    
		    @ManyToOne
		    @JoinColumn(name = "doctor_id") // This column will hold the foreign key reference to the doctor
		    private Doctor doctor;

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getPatientname() {
				return patientname;
			}

			public void setPatientname(String patientname) {
				this.patientname = patientname;
			}

			public String getPatientage() {
				return patientage;
			}

			public void setPatientage(String patientage) {
				this.patientage = patientage;
			}

			public String getDisease() {
				return disease;
			}

			public void setDisease(String disease) {
				this.disease = disease;
			}

			public Doctor getDoctor() {
				return doctor;
			}

			public void setDoctor(Doctor doctor) {
				this.doctor = doctor;
			}
}



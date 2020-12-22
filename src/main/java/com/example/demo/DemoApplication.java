package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Patient patientOne = new Patient();
		patientOne.setPhone("215-XXX-XXXX");
		patientOne.setAddress("104 Alnus Place");
		patientOne.setCity("Philadelphia");
		patientOne.setGender("XX");
		patientOne.setName("Lan");
		Patient patientTwo = new Patient();
		patientTwo.setName("Eugene");
		Patient patientThree = new Patient();
		patientThree.setName("Tariq");
		Patient patientFour = new Patient();
		patientFour.setName("Val");

		patientRepository.save(patientOne);
		patientRepository.save(patientTwo);
		patientRepository.save(patientThree);
		patientRepository.save(patientFour);


	}
}

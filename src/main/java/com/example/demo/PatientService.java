package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient getPatient(Long patientId){
        return  patientRepository.getOne(patientId);
    }

    public List<Patient> getAllPatients(){
        return  patientRepository.findAll();
    }
}

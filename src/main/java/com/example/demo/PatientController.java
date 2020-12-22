package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "*")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/")
    @ResponseBody
    public List<Patient> getPatients(){
        return patientService.getAllPatients();
    }
}

package com.example.spring.api;

import com.example.spring.dto.PatientDTO;
import com.example.spring.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientAPI {
    @Autowired
    PatientService patientService;

    @PostMapping("/")
    public ResponseEntity<?> savePatient(@RequestBody PatientDTO patientDTO){
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}

package com.example.spring.service.impl;

import com.example.spring.entity.Patient;
import com.example.spring.responsitory.PatientResponsitory;
import com.example.spring.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientResponsitory patientResponsitory;
    @Override
    public Integer save(Patient patient) {
        return patientResponsitory.save(patient).getPatientId();
    }
}

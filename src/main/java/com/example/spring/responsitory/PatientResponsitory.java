package com.example.spring.responsitory;

import com.example.spring.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientResponsitory extends JpaRepository<Patient, Integer> {
}

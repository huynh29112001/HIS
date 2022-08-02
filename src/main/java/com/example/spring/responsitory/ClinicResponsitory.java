package com.example.spring.responsitory;

import com.example.spring.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicResponsitory extends JpaRepository<Clinic, Integer> {
}

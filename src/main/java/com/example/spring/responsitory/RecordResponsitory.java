package com.example.spring.responsitory;

import com.example.spring.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordResponsitory extends JpaRepository<Record, Integer> {
}

package com.example.spring.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;
    private String patientStatus;
    private Date date;
    private String diagnosisType;
    private String numberOrder;
    private boolean status;
    private int priority;
    private String preHospital;
    private String preDisease;
    private String insuranceCode;
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "clinicId")
    private Clinic clinic;
}
package com.example.spring.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class RecordDTO {
    private int recordID;
    private String patientStatus;
    private Date date;
    private String type;
    private String numberOrder;
    private String clinicID;
    private boolean status;
    private int priority;
    private String preHospital;
    private String sick;
    private String BHYT;
}

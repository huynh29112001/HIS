package com.example.spring.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class PatientDTO {

    private int patientID;
    private String patientName;
    private String gender;
    private String region;
    private String ethnic;
    private int age;
    private Date birthday;
    private String phoneNumber;
    private int addressID;
    private String detailAddress;
    private String relative;
    private String phoneNumRelative;
    private String relationship;
    private String addrRelative;
}

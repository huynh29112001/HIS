package com.example.spring.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String name;
    private String gender;
    private String ethnic;
    private Date dob;
    private String phoneNumber;
    private String detailAddress;
    private String relative;
    private String phoneNumRelative;
    private String relationship;
    private String addrRelative;
    private Date lastUpdate;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address address;
}

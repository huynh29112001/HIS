package com.example.spring.entity;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String province;
    private String provinceId;
    private String district;
    private String districtId;
    private String ward;
    private String wardId;
    private String ward2;
    private String district2;
    private String province2;
    private String fullAddress;
    private String search;
}

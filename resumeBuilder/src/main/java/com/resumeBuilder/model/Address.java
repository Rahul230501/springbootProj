package com.resumeBuilder.model;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
	
    private String street;
    private String city;
    private String state;
    @Id
    private String zipCode;
    private String country;

}
package com.resumeBuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String company;
    private String position;
    private String jobMode; // Make sure this field exists
    private String description;
    
    @Embedded
    private DateRange date;

    // Explicit getter and setter for jobMode
    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }
}
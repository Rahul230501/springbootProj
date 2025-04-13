package com.resumeBuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String degree;
    private String institution;
    private String grade;
    
    @Embedded
    private DateRange date;
}
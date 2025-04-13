package com.resumeBuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private String url;
    
    @Embedded
    private DateRange date;
}
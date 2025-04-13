package com.resumeBuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String languages;
    private String frameworks;
    private String tools;
    private String technologies;
}
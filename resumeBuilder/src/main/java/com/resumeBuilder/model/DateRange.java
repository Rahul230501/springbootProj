package com.resumeBuilder.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class DateRange {
    private String startDate;
    private String endDate;
}
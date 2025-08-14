package com.resumeBuilder.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class DateRange {
    private String startDate;
    private String endDate;

    public DateRange() {
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DateRange)) return false;
        final DateRange other = (DateRange) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startDate = this.getStartDate();
        final Object other$startDate = other.getStartDate();
        if (this$startDate == null ? other$startDate != null : !this$startDate.equals(other$startDate)) return false;
        final Object this$endDate = this.getEndDate();
        final Object other$endDate = other.getEndDate();
        if (this$endDate == null ? other$endDate != null : !this$endDate.equals(other$endDate)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DateRange;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startDate = this.getStartDate();
        result = result * PRIME + ($startDate == null ? 43 : $startDate.hashCode());
        final Object $endDate = this.getEndDate();
        result = result * PRIME + ($endDate == null ? 43 : $endDate.hashCode());
        return result;
    }

    public String toString() {
        return "DateRange(startDate=" + this.getStartDate() + ", endDate=" + this.getEndDate() + ")";
    }
}
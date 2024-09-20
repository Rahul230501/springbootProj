package com.resume.user;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates  {
	private Date startDate;
	private Date endDate;
	
	
	
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Dates [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	private String dateSingle(int index,Date date) {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String d = formatDate(date, simpleDateFormat);
		String[] s=d.split("/");
		return s[index];
	}
	
	public String getStartDateYear() {
		return dateSingle(2,startDate);
	}
	
	public String getEndDateYear() {
		return dateSingle(2,startDate);
	}

	
	
	
	private String formatDate(Date date, SimpleDateFormat simpleDateFormat) {
		return date != null ? simpleDateFormat.format(date) : "N/A";
	}

	
}

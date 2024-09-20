package com.resume.user;

public class Experience {
	private String companyName;
	private String jobTitle;
	private String jobMode;
	private Dates date;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobMode() {
		return jobMode;
	}
	public void setJobMode(String jobMode) {
		this.jobMode = jobMode;
	}
	public Dates getDate() {
		return date;
	}
	public void setDate(Dates date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Exprience [companyName=" + companyName + ", jobTitle=" + jobTitle + ", jobMode=" + jobMode + ", date="
				+ date + "]";
	}
	
	
 
}

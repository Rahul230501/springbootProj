package com.resume.user;

public class Education {
	
	private String college;
	private String course;
	private Address address;
	private String percentage;
	private Dates date;
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public Dates getDate() {
		return date;
	}
	public void setDate(Dates date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Education [college=" + college + ", course=" + course + ", address=" + address + ", percentage="
				+ percentage + ", date=" + date + "]";
	}
	
	
	
	

}

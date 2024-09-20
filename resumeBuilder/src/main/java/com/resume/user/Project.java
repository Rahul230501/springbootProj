package com.resume.user;

public class Project {
	private String title;
	private String desc;
	private Dates date;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Dates getDate() {
		return date;
	}
	public void setDate(Dates date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Project [title=" + title + ", desc=" + desc + ", date=" + date + "]";
	}
	
	

}

package com.resume.user;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String name;
	private String phone;
	private String email;
	private String linkdinId;
	private String about;
	private List<Education> education = new ArrayList<>() ;
	private Skill skill;
	private List<Project> projects = new ArrayList<>();
	private List<Experience> experience = new ArrayList<>();
	private Address address;
	


	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getId() {
		return id;
	}   

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkdinId() {
		return linkdinId;
	}

	public void setLinkdinId(String linkdinId) {
		this.linkdinId = linkdinId;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", linkdinId="
				+ linkdinId + ", education=" + education + ", skill=" + skill + ", project=" + projects + ", experience="
				+ experience + ", address=" + address + "]";
	}

}

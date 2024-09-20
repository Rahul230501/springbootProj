package com.generate.chart.entity;

public class Data {
     String categories;
     String value;
     
     
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [categories=" + categories + ", value=" + value + "]";
	}
     
	
	
     
}

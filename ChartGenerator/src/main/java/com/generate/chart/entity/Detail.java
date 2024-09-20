package com.generate.chart.entity;

public class Detail {
	String title;
	String subtitle;
	String yAsix;
	String xAsix;
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getxAsix() {
		return xAsix;
	}
	public void setxAsix(String xAsix) {
		this.xAsix = xAsix;
	}
	public String getyAsix() {
		return yAsix;
	}
	public void setyAsix(String yAsix) {
		this.yAsix = yAsix;
	}
	
	
	@Override
	public String toString() {
		return "Detail [title=" + title + ", subtitle=" + subtitle + ", xAsix=" + xAsix + ", yAsix=" + yAsix + "]";
	}
	
	

}

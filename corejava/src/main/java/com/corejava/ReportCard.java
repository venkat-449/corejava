package com.corejava;


public class ReportCard {
	private int marks;
	public ReportCard() {
		this.marks =(int)((Math.random()*101)+1); 
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}

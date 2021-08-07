package com.corejava;

public class Student {
	private String regestrationNumber;
	
	public Student(String regestrationNumber) {
		this.regestrationNumber=regestrationNumber;
		
	}

	public String getRegestrationNumber() {
		return regestrationNumber;
	}

	public void setRegestrationNumber(String regestrationNumber) {
		this.regestrationNumber = regestrationNumber;
	}
	 
	public boolean equals(Object o) {
		if(o!=null && o instanceof Student) {
			String regNumber=((Student)o).getRegestrationNumber();
			if(regNumber!=null && regNumber.equals(this.getRegestrationNumber())) {
				return true;
			}
			
		}
		return false;
	}

	public int hashcode() {
		return this.regestrationNumber.hashCode();
	}
}
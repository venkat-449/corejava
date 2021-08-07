package com.corejava;

public class ComparableTopic     //implements Comparable<ComparableTopic>
{
	public String brand;
	public int ram;
	public int price;
	public ComparableTopic(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ComparableTopic [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	/*
	@Override
	public int compareTo(ComparableTopic o) {
		if(this.getRam() > o.getRam()) {
		      return 1;
		}
		else {
			return -1;
		}
	
	}
	*/
    
}

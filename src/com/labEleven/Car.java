package com.labEleven;

public class Car {

	//I declare my instance variables
	
	private String make;
	private String model;
	private int year;
	private double price;

	//No argument constructor as a default
	
	public Car() {

	}

	//constructor corresponding to the inventory listing
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	//getters and setters
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//toString override
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s $%-10s", make, model, year, price);
	}

}

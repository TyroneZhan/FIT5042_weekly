/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author Tong
 * 
 */
//TODO Exercise 1.3 Step 1 Please refer tutorial exercise. 
public class Property {
    private int id;
    private String address;
    private int numberOfBedrooms;
    private int size;
    private double price;
    
	public Property() {
		this.id = 0;
		this.address = "";
		this.numberOfBedrooms = 0;
		this.size = 0;
		this.price = 0.00;
		// TODO Auto-generated constructor stub
	}
	
	public Property(Property property) {
		this.id = property.id;
		this.address = property.address;
		this.numberOfBedrooms = property.numberOfBedrooms;
		this.size = property.size;
		this.price = property.price;	
	}

	public Property(int id, String address, int numberOfBedrooms, int size, double price) {
		this.id = id;
		this.address = address;
		this.numberOfBedrooms = numberOfBedrooms;
		this.size = size;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " " + address + " " + numberOfBedrooms + "BR(s) " + size + "sqm $" + price ;
	}
    
	
}

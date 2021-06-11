package com.vti.entity.vehicle;

public abstract class Vehicle {
	String color;
	String type;
	int wheelAmount;
	int price;
	
	public abstract void di ();

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getWheelAmount() {
		return wheelAmount;
	}


	public void setWheelAmount(int wheelAmount) {
		this.wheelAmount = wheelAmount;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", type=" + type + ", wheelAmount=" + wheelAmount + ", price=" + price + "]";
	}

}

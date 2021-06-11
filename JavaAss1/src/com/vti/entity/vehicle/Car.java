package com.vti.entity.vehicle;

public class Car extends Vehicle {

	
	public Car() {
		super();
		wheelAmount = 4;
	}

	@Override
	public void di() {
		System.out.println("Đi bằng 4 bánh !!!");
		
	}

}

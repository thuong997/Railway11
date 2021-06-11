package com.vti.entity.vehicle;

public class Motor extends Vehicle {

	
	public Motor() {
		super();
		wheelAmount = 2;
	}

	@Override
	public void di() {
		System.out.println("Đi bằng 2 bánh !!");
		
	}

}

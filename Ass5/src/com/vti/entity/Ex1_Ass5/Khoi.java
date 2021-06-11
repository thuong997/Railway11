package com.vti.entity.Ex1_Ass5;

public class Khoi {
	String name;
	String monHoc;

	public Khoi() {

	}

	public Khoi(String name) {
		super();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public String getMonHoc() {
		
		switch (this.name) {
		case "A":
			this.monHoc = "Toán, Lý, Hóa";
			break;
		case "B":
			this.monHoc = "Toán, Hóa, Sinh";
			break;
		case "C":
			this.monHoc = "Văn, Sử, Địa";
			break;

		default:
			break;
		}
		return this.monHoc;
	}

	@Override
	public String toString() {
		return "Khoi [name: " + name + ", monHoc: " + monHoc + "]";
	}

}

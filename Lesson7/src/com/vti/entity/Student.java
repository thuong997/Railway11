package com.vti.entity;

import com.vti.backend.Ex1;
import com.vti.ultis.ScannerUltils;

public class Student {
	public static int count = 0;// Đếm số lượng hs được khởi tạo
	private int id;
	private String name;
	public static String college = "Đại học bách khoa";
	public static int moneyGroup = 0;

	public Student() {
		super();
		
		if (count >= 7) {
			System.err.println("chỉ được tạo tối đa 7 học sinh");
		} else {
			count++;
			this.id = count;
			//System.out.println("nhập tên học sinh");
			//this.name = ScannerUltils.inputString();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + ", college: " + college + ", moneyGroup: " + moneyGroup + "]";
	}

}

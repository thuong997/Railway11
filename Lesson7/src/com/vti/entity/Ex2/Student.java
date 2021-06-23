package com.vti.entity.Ex2;

import com.vti.ultis.ScannerUltils;

public class Student {
	public static int count = 0;// Đếm số lượng hs được khởi tạo
	final int id;
	String name;

	public static void study() {
		System.out.println("đang học bài");
	}

	public Student() {
		this.id = 1;
		System.out.println("nhập tên học sinh:");
		this.name = ScannerUltils.inputString();
		Student.study();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		Student.study();
		count++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + "]";
	}

}

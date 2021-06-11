package com.vti.entity.Ex2_Ass5_Q2;

import java.util.Scanner;

public class Student extends Person {
	int codeSv;
	float diemTb;
	String email;

	public Student() {

	}

	public Student(int codeSv, float diemTb, String email) {
		super();
		this.codeSv = codeSv;
		this.diemTb = diemTb;
		this.email = email;
	}

	public int getCodeSv() {
		return codeSv;
	}

	public void setCodeSv(int codeSv) {
		this.codeSv = codeSv;
	}

	public float getDiemTb() {
		return diemTb;
	}

	public void setDiemTb(float diemTb) {
		this.diemTb = diemTb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập code SV");
		this.codeSv = scan.nextInt();
		System.out.println("nhập số điểm trung bình: ");
		this.diemTb = scan.nextFloat();
		System.out.println("nhập email: ");
		this.email = scan.next();
	}

	public String showInfo() {
		return "Student [codeSv: " + codeSv + ", diemTb: " + diemTb + ", email: " + email + "]";
	}
	public boolean nhanHocBong() {
		return diemTb > 8.0 ? true : false;
	}
}

package com.vti.entity.Ex2_Ass5_Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	String ten;
	String gioiTinh;
	String birthDay;
	String diaChi;

	public Person() {

	}

	public Person(String ten, String gioiTinh, String birthDay, String diaChi) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.birthDay = birthDay;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập tên:");
		this.ten = scan.nextLine();
		System.out.println("nhập giới tính: (nam, nữ, bê đê)");
		this.gioiTinh = scan.nextLine();
		System.out.println("nhập ngày sinh");
		this.birthDay = scan.nextLine();
		System.out.println("nhập địa chỉ");
		this.diaChi = scan.nextLine();
	}

	
	public String showInfo() {
		return "Person [ten: " + ten + ", gioiTinh: " + gioiTinh + ", birthDay: " + birthDay 
				+ ", diaChi: " + diaChi
				+ "]";
	}

}

package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float diemHocLuc;

	public float getDiemHocLuc() {
		return diemHocLuc;
	}

	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}

	public void congDiem(float diemCong) {
		this.diemHocLuc = this.diemHocLuc + diemCong;
	}

	public Student() {

	}

	public Student(String name, String homeTown) {
		super();
		this.name = name;
		this.homeTown = homeTown;

	}

	public String toString() {
		String diemHocLuc1 = "";
		if (diemHocLuc < 4) {
			diemHocLuc1 = "Yếu";
		} else if (diemHocLuc >= 4 && diemHocLuc < 6) {
			diemHocLuc1 = "Trung bình";
		} else if (diemHocLuc >= 6 && diemHocLuc < 8) {
			diemHocLuc1 = "Khá";
		} else {
			diemHocLuc1 = "Giỏi";
		}
		return "Student [id=" + id + ", name=" + name + ", homeTown=" + homeTown + ", diemHocLuc=" + diemHocLuc1 + "]";
	}

}

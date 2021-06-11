package com.vti.entity.Ex1_Ass5;

public class ThiSinh {
	int id;
	String name;
	String diaChi;
	int mucUuTien;
	Khoi khoi;

	public ThiSinh() {

	}

	public ThiSinh(int id, String name, String diaChi, int mucUuTien, Khoi khoi) {
		super();
		this.id = id;
		this.name = name;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoi = khoi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ThiSinh [id: " + id + ", name: " + name + ", diaChi: " + diaChi + ", mucUuTien: " + mucUuTien
				+ " , Khoi: " + khoi.getName() + " , môn học: " + khoi.getMonHoc() + "]";
	}

}

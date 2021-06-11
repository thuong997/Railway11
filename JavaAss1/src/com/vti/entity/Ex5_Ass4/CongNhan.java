package com.vti.entity.Ex5_Ass4;

public class CongNhan extends CanBo {
	String bac;

	public CongNhan(String bac) {
		super();
		this.bac = bac;
	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}

	public CongNhan() {
		super();
		
	}

	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		
	}
	
	
}

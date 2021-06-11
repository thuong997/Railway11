package com.vti.entity.Ex5_Ass4;

import java.util.Scanner;

public class TaiLieu {
	int maTaiLieu;
	String tenNhaSuatBan;
	String soBanPhatHanh;
	
	public TaiLieu() {
		
	}
	public TaiLieu(int maTaiLieu, String tenNhaSuatBan, String soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaSuatBan = tenNhaSuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu= " + maTaiLieu + ", tenNhaSuatBan= " + tenNhaSuatBan + ", soBanPhatHanh= "
				+ soBanPhatHanh + "]";
	}
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	
}

package com.vti.entity.Ex5_Ass4;

public class NhanVien extends CanBo {
	String congViec;

	public NhanVien(String congViec) {
		super();
		this.congViec = congViec;
	}

	public NhanVien() {
		super();
		
	}

	public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}


	
}

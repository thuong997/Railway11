package com.vti.entity.Ex5_Ass4;

public class Sach extends TaiLieu {
	String tenTacGia;
	int soTrang;
	
	
	public Sach() {
		
	}
	public Sach(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + ", maTaiLieu=" + maTaiLieu + ", tenNhaSuatBan="
				+ tenNhaSuatBan + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public Sach(int maTaiLieu, String tenNhaSuatBan, String soBanPhatHanh) {
		super(maTaiLieu, tenNhaSuatBan, soBanPhatHanh);
		
	}
	
		
	
	
}

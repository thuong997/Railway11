package com.vti.entity.Ex5_Ass4;

public class TapChi extends TaiLieu {
	int soPhatHanh;
	int thangPhatHanh;
	public TapChi() {
		super();
		
	}
	
	public TapChi(int maTaiLieu, String tenNhaSuatBan, String soBanPhatHanh) {
		super(maTaiLieu, tenNhaSuatBan, soBanPhatHanh);
		
	}

	public TapChi(int soPhatHanh, int thangPhatHanh) {
		super();
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
}

package com.vti.entity.Ex5_Ass4;

import java.time.LocalDate;

public class Bao extends TaiLieu {
	LocalDate ngayPhatHanh;

	public Bao() {
		super();
	
	}

	public Bao(int maTaiLieu, String tenNhaSuatBan, String soBanPhatHanh) {
		super(maTaiLieu, tenNhaSuatBan, soBanPhatHanh);
		
	}
	
	public Bao(LocalDate ngayPhatHanh) {
		super();
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public LocalDate getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	
}

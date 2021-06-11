package com.vti.entity.Ex5_Ass4;

public class KySu extends CanBo {
	private String nganhDaoTao;
	public KySu() {
		super();
		
	}

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		
	}

	

	public KySu(String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
}

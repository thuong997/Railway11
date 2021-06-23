package com.vti.entity;

import com.vti.ultis.ScannerUltils;

public class PrimaryStudent extends Student {
	public static int countPri = 0;// Đếm số lượng hs được khởi tạo

	public PrimaryStudent() {
		super();
		countPri++;
	}

	
}

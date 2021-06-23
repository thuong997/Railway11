package com.vti.entity;

import com.vti.ultis.ScannerUltils;

public class SecondaryStudent extends Student {
	public static int countSe = 0;// Đếm số lượng hs được khởi tạo
	
	public SecondaryStudent() {
		super();
		countSe++;
	}

}

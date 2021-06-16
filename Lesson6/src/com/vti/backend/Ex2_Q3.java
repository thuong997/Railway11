package com.vti.backend;

public class Ex2_Q3 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		try {
		System.out.println(numbers[10]);
		}catch(Exception e){
			System.out.println("không tìm thấy phần tử trong mảng");
		
		}
	}

}

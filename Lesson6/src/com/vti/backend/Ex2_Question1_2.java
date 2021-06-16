package com.vti.backend;

public class Ex2_Question1_2 {

	public static void main(String[] args) {
		try {
			float result = divide(7, 1);
			System.out.println(result);
		} catch (Exception a) {
			System.out.println("không thể chia cho 0");
		} finally {
			System.out.println("chia thành công");
		}

	}

	private static float divide(int a, int b) {

		return a / b;
	}

}

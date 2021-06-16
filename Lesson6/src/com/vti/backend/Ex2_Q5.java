package com.vti.backend;

import java.util.Scanner;

public class Ex2_Q5 {

	public void question5() {
		int age = inputAge();
		System.out.println("tuổi: " + age);
	}

	public static int inputAge() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập tuổi vào đây bro: ");
				int age = sc.nextInt();
				if (age < 0) {
					System.out.println("nhập vào tuổi lớn hơn 0 bro ơi");
				} else {
					return age;
				}
			} catch (Exception e) {
				System.out.println("nhập vào int bro ơi");
			}
		}
	}
}

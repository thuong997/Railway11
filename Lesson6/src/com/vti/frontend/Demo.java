package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.InvalidAgeException;

public class Demo {

	public static void main(String[] args) {

//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("nhập tuổi vào đây bro: ");
//				int age = sc.nextInt();
//
//				sc.close();
//
//				System.out.println("Tuổi của bro là: " + age);
//				return;
//			} catch (Exception e) {
//				System.out.println("nhập vào số nguyên bro ơi !!!");
//
//			}

		try {
			checkAge(15);
		} catch (InvalidAgeException e) {

			System.out.println("Exception: " + e.getMessage());
		}

	}

	private static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("bạn cần ít nhất 18 tuổi");
		} else {
			System.out.println("tuổi: " + age);
		}
	}

}

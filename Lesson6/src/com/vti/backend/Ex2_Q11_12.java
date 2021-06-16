package com.vti.backend;

import com.vti.Utils.ScannerUltils;
import com.vti.entity.Account;
import com.vti.entity.InvalidAgeException;

public class Ex2_Q11_12 {
	public static void main(String[] args) throws InvalidAgeException {
		inputAccountAge();
	}

	public static int inputAccountAge() throws InvalidAgeException {

		System.out.println("nhập tuổi vào đây: ");

		int age = ScannerUltils.inputAge();
		while (true) {
			if (age <= 0) {
				throw new InvalidAgeException("Tuổi phải lớn hơn 0");
			} else if (age < 18) {
				throw new InvalidAgeException("bạn cần ít nhất 18 tuổi");
			}else if(age > 18) {
				System.out.println("Tuổi: " + age );
				break;
			} else {
				return age;
			}

		}
		return age;
	}
}
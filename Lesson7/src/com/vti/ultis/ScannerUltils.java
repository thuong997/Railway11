package com.vti.ultis;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUltils {

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

	public static int inputInt() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập số bất kỳ vào đây bro: ");
				int so = sc.nextInt();

				return so;

			} catch (Exception e) {
				System.out.println("nhập vào int bro ơi");
			}
		}
	}

	public static float inputFloat() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập số vào đây bro: ");
				float so = sc.nextFloat();

				return so;

			} catch (Exception e) {
				System.out.println("nhập vào float bro ơi");
			}
		}
	}

	public static String inputString() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập chữ bất kỳ vào đây bro: ");
				String chuoi = sc.nextLine();

				return chuoi;

			} catch (Exception e) {
				System.out.println("nhập vào chữ bro ơi");
			}
		}
	}

	public static long inputLong() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập số vào đây bro: ");
				long so = sc.nextLong();

				return (long) so;

			} catch (Exception e) {
				System.out.println("nhập số vào bro ơi");
			}
		}
	}

	public static double inputDouble() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập số vào đây bro: ");
				double so = sc.nextDouble();

				return so;

			} catch (Exception e) {
				System.out.println("nhập số vào bro ơi");
			}
		}
	}

	public static byte inputByte() {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhập số vào đây bro: ");
				byte so = sc.nextByte();

				return so;

			} catch (Exception e) {
				System.out.println("nhập số vào bro ơi");
			}
		}
	}

	public static LocalDate inputLocalDate() {
		System.out.println("Nhập theo định dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			Scanner sc = new Scanner(System.in);
			String localdate = sc.next().trim();
			try {
				if (format.parse(localdate) != null) {
					LocalDate lc = LocalDate.parse(localdate);
					return lc;
				}
			} catch (Exception e) {
				System.err.println("Nhập lại:");
			}
		}
	}
}

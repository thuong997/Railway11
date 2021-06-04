package lesson3;

import java.util.Random;
import java.util.Scanner;

public class ex1_ass3 {

	public static void main(String[] args) {
//		Question 1:
//			Khai báo 2 số lương có kiểu dữ liệu là float.
//			Khởi tạo Lương của Account 1 là 5240.5 $
//			Khởi tạo Lương của Account 2 là 10970.055$
//			Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//			Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		float accId1;
		float accId2;
		accId1 = (float) 5240.5;
		accId2 = (float) 10970.055;
		int intAccId1 = (int) accId1;
		int intAccId2 = (int) accId2;
		System.out.println("Lương của account 1 là: " + intAccId1 );
		System.out.println("Lương của account 2 là: " + intAccId2);

//		Question 2:Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		Random random = new Random();
		int i = random.nextInt(100000);
		if(i >= 10000 ) {
			System.out.println(i);
		}else if(i > 1000 && i < 10000) {
			System.out.println("0" + i);
		}else if(i > 100 && i < 1000) {
			System.out.println("0" + i);
		}else if(i > 10 && i < 100) {
			System.out.println("0" + i);
		}
		//Question 3:Lấy 2 số cuối của số ở Question 2 và in ra.
		//Gợi ý:Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
		//Cách 2: chia lấy dư số đó cho 100
		System.out.println("Số ngẫu nhiên có 5 số: " + i);
		String a = String.valueOf(i);
		System.out.println("Hai số cuối là: " + a.substring(3));
		
		
		//Question 4:Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		question4();

	
	
	}
	static void question4() {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Mời bạn nhập a: ");
		a = scan.nextInt();
		System.out.println("Mời bạn nhập b: ");
		b = scan.nextInt();
		if(b == 0);{
			System.out.println("Hãy nhập b khác 0!");
	}
		System.out.println("Thương: " + (float)a/b);
}
}

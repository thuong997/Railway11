package lesson3;

import java.time.LocalDate;
import java.util.Date;

public class Ex2_Ass3 {
	String email;
	String userName;
	String fullName;
	LocalDate createDate;
	@Override
	public String toString() {
		return "Ex2_Ass3 [email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", createDate="
				+ createDate + "]";
	}
	public static void main(String[] args) {
//		Question 1:
//			Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//			tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//			 Email: "Email 1"
//			 Username: "User name 1"
//			 FullName: "Full name 1"
//			 CreateDate: now
		question1();
	}
	static void question1() {
		Ex2_Ass3[] accArray = new Ex2_Ass3[5];
		int i;
		for(i = 0 ; i < accArray.length ; i++ ) {
			Ex2_Ass3 acc = new Ex2_Ass3();
			acc.email = "Email: " + i;
			acc.userName = "User Name: " + i;
			acc.fullName = "Full Name: " + i;
			acc.createDate = LocalDate.now();
			accArray[i] = acc;
			System.out.println("Thông tin account: " + acc);
			
		}
	}

}

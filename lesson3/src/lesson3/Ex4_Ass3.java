package lesson3;

import java.util.Scanner;

public class Ex4_Ass3 {

	public static void main(String[] args) {
		// Question 1:Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ
		// có
		// thể cách nhau bằng nhiều khoảng trắng );
		String i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập vào 1 xâu ký tự: ");
		i = scanner.nextLine();
		System.out.println(i.length());

		// Question 2:Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		String s1, s2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hãy nhập chuỗi s1: ");
		s1 = scan.nextLine();
		System.out.println("Hãy nhập chuỗi s2: ");
		s2 = scan.nextLine();
		System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);

		// Question 3:Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên
		// chưa
		// viết hoa chữ cái đầu thì viết hoa lên
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập tên vào đây: ");
		ten = sc.nextLine();
		String name = ten.substring(0, 1).toUpperCase();
		String names = ten.substring(1);
		System.out.println("kết quả: " + name + names);

		// Question 4:Viết chương trình để người dùng nhập vào tên in từng ký tự trong
		// tên
		// của người dùng ra 
		// VD: 
		// Người dùng nhập vào "Nam", hệ thống sẽ in ra
		// "Ký tự thứ 1 là: N" 
		// "Ký tự thứ 1 là: A" 
		// "Ký tự thứ 1 là: M"
		String bro;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhập tên vào đây: ");
		bro = scaner.nextLine();
		bro = bro.toUpperCase();
		int b = 0;
		for (b = 0; b < bro.length(); b++) {
			System.out.println("Ký tự thứ " + b + " là: " + bro.charAt(b));
		}

		// Question 5:Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
		// dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		String họ, tên;
		Scanner scr = new Scanner(System.in);
		System.out.println("Mời bạn nhập họ: ");
		họ = scr.nextLine();
		System.out.println("Mời bạn nhập tên: ");
		tên = scr.nextLine();
		System.out.println("Họ tên của bạn là: " + họ + " " + tên);

		// Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
		// sau đó hệ thống sẽ tách ra họ, tên , tên đệm
		// VD:
		// Người dùng nhập vào "Nguyễn Văn Nam"
		// Hệ thống sẽ in ra
		// "Họ là: Nguyễn"
		// "Tên đệm là: Văn"
		// "Tên là: Nam"

		// Question 7: // Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ
		// và
		// chuẩn hóa họ và tên của họ như sau:
		// a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
		// vào
		// VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
		// chuẩn hóa thành "nguyễn văn nam"
		// b) Viết hoa chữ cái mỗi từ của người dùng
		// VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
		// chuẩn hóa thành "Nguyễn Văn Nam"
		Scanner v = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên");
		String tens = v.nextLine();
		System.out.println("Tên bạn là :" + tens.trim());

		// Question 8:In ra tất cả các group có chứa chữ "Java"
		String[] group = { "Cày to tay vì Java", "Khóc cạn nước mắt với Java", "Còn cái Nịt", "Còn đúng cái nịt",
				"Java là cái gì?" };
		for (String string : group) {
			if (string.contains("Java")) {
				System.out.println(string);
			}
		}

		// Question 9: In ra tất cả các group "Java"
		String[] groups = { "Java", "C# Java", "Java fesh", "Tiến bịp", "pewpew" };
		for (String string : groups) {
			if (string.contains("Java")) {
				System.out.println(string);
			}
		}

		// Question 10 (Optional):Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
		// Nếu có xuất ra “OK” ngược lại “KO”.
		// Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
		String r1, r2;
		Scanner scv = new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi 1: ");
		r1 = scv.nextLine();
		System.out.println("Mời bạn nhập chuỗi 3: ");
		r2 = scv.nextLine();
		if (r2.equals(r1) == true) {
			System.out.println("đây là không phải chuỗi đảo ngược");
		} else if (r2.equals(r1) == false) {
			System.out.println("đây là chuỗi đảo ngược");
		}

		// Question 11 (Optional): Count special Character
		// Tìm số lần xuất hiện ký tự "a" trong chuỗi
		Scanner sca = new Scanner(System.in);
		String sta;
		System.out.println("Mời bạn nhập vào một chuỗi: ");
		sta = sca.nextLine();
		int count = 0;
		for (int l = 0; l < sta.length(); l++) {
			if ('a' == sta.charAt(l)) {
				count++;
			}
		}
		System.out.println(count);

		// Question 12 (Optional): Reverse String Đảo ngược chuỗi sử dụng vòng lặp

		// Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false

		// Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		String hihi = "Hôm nay trời đẹp quá....ỏ...";
		String replaceString = hihi.replace("quá", "thế nhề");
		System.out.println("chuỗi sau khi được thay đổi là: ");
		System.out.println(replaceString);

		//

	}

}

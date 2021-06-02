import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Program2 {

	public static void main(String[] args) {

		// create department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketting";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Nhân sự";
		Department[] dep = new Department[] { department1, department2, department3 };
		Department[] dep2 = new Department[] { department1, department2 };

		// create position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.PM;

		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.DEV;

		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = PositionName.TEST;

		Account acc3 = new Account();
		acc3.accountId = 3;
		acc3.email = "thuong@gmail.com";
		acc3.userName = "Thuong";
		acc3.fullName = "Thưởng Nguyễn";
		acc3.department = department1;
		acc3.position = position1;
		acc3.createDate = new Date("2021/05/29");

		Account acc4 = new Account();
		acc4.accountId = 4;
		acc4.email = "thuongnguyen@gmail.com";
		acc4.userName = "Thuong1";
		acc4.fullName = "Thưởng Nguyễn1";
		acc4.department = department2;
		acc4.position = position2;
		acc4.createDate = new Date("2021/05/29");
		// create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Fresher";
		group1.createDate = new Date("2021/05/29");
		group1.accounts = new Account[] { acc3, acc4 };

		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "C# Fresher";
		group2.createDate = new Date("2021/05/29");

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "leuleu";
		group3.createDate = new Date("2021/05/29");

		// create account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "nguyenthuong@gmail.com";
		account1.userName = "Thuong";
		account1.fullName = "Nguyễn Văn Thưởng";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = new Date("2021/05/29");
		account1.groups = new Group[] { group1, group2 };

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "thuha@gmail.com";
		account2.userName = "Ha";
		account2.fullName = "Bạch Thu Hà";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date("2021/05/29");
		account2.groups = new Group[] { group1, group2, group2 };

		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "thuong@gmail.com";
		account3.userName = "Thuong";
		account3.fullName = "Nguyễn Thưởng";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = new Date("2021/05/29");
		Account[] dsAccount = new Account[] { account1, account2, account3 };
		account3.groups = new Group[] { group1, group2, group3 };

		// create groupAccount
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.account = account1;
		GroupAccount1.group = group1;
		GroupAccount1.joinDate = new Date("2021/05/29");

		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.account = account2;
		GroupAccount2.group = group2;
		GroupAccount2.joinDate = new Date("2021/05/29");

		GroupAccount GroupAccount3 = new GroupAccount();
		GroupAccount3.account = account3;
		GroupAccount3.group = group3;
		GroupAccount3.joinDate = new Date("2021/05/29");

		// create typeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = enums.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = enums.MULTIPLE_CHOICE;

		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3;
		typeQuestion3.typeName = enums.ESSAY;

		// create categoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "JAVA";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "PYTHON";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "RUBY";

		// create question
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "câu hỏi về JAVA";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.account = account1;
		question1.createDate = new Date("2021/05/29");

		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "câu hỏi về PYTHON";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.account = account2;
		question2.createDate = new Date("2021/05/29");

		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "câu hỏi về JAVA";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion3;
		question3.account = account3;
		question3.createDate = new Date("2021/05/29");

		// create answer
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "mới học JAVA";
		answer1.isccorect = true;
		answer1.question = question1;

		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "mới học PYTHON";
		answer2.isccorect = true;
		answer2.question = question2;

		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = "mới học RUBY";
		answer3.isccorect = true;
		answer3.question = question3;

		// create exam
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = 1234;
		exam1.title = "hãy làm java";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.account = account1;
		exam1.createDate = new Date("2021/05/29");

		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = 1235;
		exam2.title = "hãy làm python";
		exam2.category = categoryQuestion2;
		exam2.duration = 50;
		exam2.account = account2;
		exam2.createDate = new Date("2021/05/29");

		Exam exam3 = new Exam();
		exam3.examId = 1;
		exam3.code = 1234;
		exam3.title = "hãy làm ruby";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.account = account3;
		exam3.createDate = new Date("2021/05/29");
		Exam[] dsExam = new Exam[] { exam1, exam2, exam3 };

		// create examQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;

		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;

		// ----Exercise 1 (Optional): Flow Control>>>>>>>>>>
//				question 1: Kiểm tra account thứ 2
//				Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//				"Nhân viên này chưa có phòng ban"
//				Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
		if (account1.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else
			System.out.println("Phòng ban của nhân viên này là DEV");

		// Question 2:
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1) {
			System.out.println(account2.groups[0].groupName);
		} else if (account2.groups.length == 2) {
			System.out.println(account2.groups[0].groupName);
			System.out.println(account2.groups[1].groupName);
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (account2.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// Question 3: Sử dụng toán tử ternary để làm Question 1
		System.out.println(account1.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là DEV" + account1.department);

		// Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println(account1.position != null && account1.position.positionName == PositionName.DEV ? "đây là Developer"
				: "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		if (group1.accounts == null) {
			System.out.println("Nhóm không có thành viên");
		} else {
			int accInGroup = group1.accounts.length;
			switch (accInGroup) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

		// Question 6: Sử dụng switch case để làm lại Question 2
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int acc2Group = account2.groups.length;
			switch (acc2Group) {
			case 1:
				System.out.println(account2.groups[0].groupName);
				break;
			case 2:
				System.out.println(account2.groups[0].groupName);
				System.out.println(account2.groups[1].groupName);
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			case 4:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			default:
				System.out.println("Nhân viên này chưa có tuổi k cho vào group");
				break;
			}
			// Question 7:Sử dụng switch case để làm lại Question 4
			String accPosName = account1.position.positionName.toString();
			switch (accPosName) {
			case "DEV":
				System.out.println("đây là Developer");
				break;
			default:
				System.out.println("Người này không phải là Developer");
				break;
			}

		}

//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

		System.out.println(dsAccount.length);
		for (Account account : dsAccount) {
			System.out.println("email: " + account.email);
			System.out.println("fullName: " + account.fullName);
			System.out.println(account.department == null ? "không có phòng ban"
					: "phòng ban: " + account.department.departmentName);
		}

		// Question 9: In ra thông tin các phòng ban bao gồm: id và name
		System.out.println(dep.length);
		for (Department department : dep) {
			System.out.println("depId: " + department.departmentId);
			System.out.println("depName: " + department.departmentName);
		}

//		Question 10:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là:
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
//			Thông tin account thứ 2 là:
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting

		for (int i = 0; i < dsAccount.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println(dsAccount[i].toString());
		}

//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing

		Department[] dsDepartment = new Department[] { department1, department2, department3 };
		for (int i = 0; i < dsDepartment.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println(dsDepartment[i].toString());
		}

		// Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		// question 10

		for (int i = 0; i < dep2.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println(dep2[i].toString());
		}

		// Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
		for (int i = 0; i < dsAccount.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(dsAccount[i].toString());
		}

		// Question 14: In ra thông tin tất cả các account có id < 4
		for (int a = 0; a < dsAccount.length; a++) {
			if (dsAccount[a].accountId < 4) {
			}
			System.out.println(dsAccount[a].toString());
		}
		// Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("số chẵn nhỏ hơn 20");
		for (int x = 0; x < 20; x++) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}
		// Question 16:Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp
		// với
		// lệnh break, continue

		// Question 17:Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết
		// hợp với
		// lệnh break, continue

		// -----Exercise 2 (Optional): System out printf>>>>>>>
		// Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in
		// ra số nguyên đó
		int c = 5;
		System.out.printf("'%s' %n", c);

		// Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
		// printf để in
		// ra số nguyên đó thành định dạng như sau: 100,000,000
		int b = 1000000000;
		System.out.printf(Locale.US, "%,d %n", b);

		// Question 3:Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để
		// in ra số
		// thực đó chỉ bao gồm 4 số đằng sau
		float f = 5.567098f;
		System.out.printf("'%5.4f'%n", 5.567098);

		// Question 4:Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó
		// theo định
//		dạng như sau:
//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		String t = "Nguyễn Văn Thưởng";
		System.out.printf("'%s' %n", "Tên tôi là " + t + " và tôi đã có người yêu");

		// Question 5:Lấy thời gian bây giờ và in ra theo định dạng sau:
		// 24/04/2020 11h:16p:20s
		Date date = new Date();
		Timer time = new Timer();
		System.out.printf("%1$td/%1$tm/%1$ty %n %tT%n", date, time);

		// Question 6:In ra thông tin account (như Question 8 phần FOREACH) theo định
		// dạng
		// table (giống trong Database)
		// System.out.printf();

		// ------Exercise 3 (Optional): Date Format
		// Question 1:In ra thông tin Exam thứ 1 và property create date sẽ được format
		// theo định
		// dạng vietnamese
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String ngay = dateformat.format(exam1.createDate);
		System.out.println(exam1.code + ": " + ngay);

		// Question 2:In ra thông tin: Exam đã tạo ngày nào theo định dạng
		// Năm – tháng – ngày – giờ – phút – giây
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : dsExam) {
			String dates = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + dates);
		}
		

		// Question 3:Chỉ in ra năm của create date property trong Question 2
		String patterns = "yyyy";
		SimpleDateFormat simpleDateFormats = new SimpleDateFormat(patterns);
		for (Exam exam : dsExam) {
			String dater = simpleDateFormats.format(exam.createDate);
			System.out.println(exam.code + ": " + dater);
		}
		//Question 4:Chỉ in ra tháng và năm của create date property trong Question 2
		String patter = "MM/yyyy";
		SimpleDateFormat DateFormat = new SimpleDateFormat(patter);
		for (Exam exam : dsExam) {
			String mmY = DateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + mmY);
		}
		//Question 5:Chỉ in ra "MM-DD" của create date trong Question 2
		String patte = "MM-dd";
		SimpleDateFormat DateFormatr = new SimpleDateFormat(patte);
		for (Exam exam : dsExam) {
			String mmD = DateFormatr.format(exam.createDate);
			System.out.println(exam.code + ": " + mmD);
		}


		// ----method>>>>
		// Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
		inSoChan();
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// Question 2: Tạo method để in thông tin các account
		question2(dsAccount);

		// Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
		insonguyenduongnhohon10();
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}

	static void inSoChan() {
		System.out.println("in số chẵn....");

	}

	static void question2(Account[] lishAccount) {
		for (Account account : lishAccount) {
			System.out.println(account.toString());
		}

	}

	static void insonguyenduongnhohon10() {
		System.out.println("số nguyên dương nhỏ hơn 10 ");
	}
}

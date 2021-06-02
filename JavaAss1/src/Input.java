import java.time.LocalDate;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// -----Exercise 5: Input from console>>>>>>>
		// Question1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số nguyên thứ 1: ");
		int soNguyenT1 = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số nguyên thứ 2: ");
		int soNguyenT2 = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số nguyên thứ 3: ");
		int soNguyenT3 = scanner.nextInt();
		System.out.println("số nguyên vừa nhập: " + soNguyenT1 + " " + soNguyenT2 + " " + soNguyenT3 + "");

		// Question 2:Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		Scanner scanne = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thực thứ 1: ");
		float soThucT1 = scanne.nextFloat();

		System.out.println("Mời bạn nhập vào số thực thứ 2: ");
		float soThucT2 = scanne.nextFloat();
		System.out.println("số nguyên vừa nhập: " + soThucT1 + " " + soThucT2 + "");

		// Question 3:Viết lệnh cho phép người dùng nhập họ và tên
		Scanner scanTen = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào họ và tên: ");
		String ten = scanTen.nextLine();
		System.out.println(ten);

		// Question 4:Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		Scanner scanBirth = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào năm sinh: ");
		int namSinh = scanBirth.nextInt();

		System.out.println("mời bạn nhập vào tháng sinh: ");
		int thangSinh = scanBirth.nextInt();

		System.out.println("mời bạn nhập vào ngày sinh: ");
		int ngaySinh = scanBirth.nextInt();
		LocalDate birth = LocalDate.of(namSinh, thangSinh, ngaySinh);

		System.out.println("sinh nhật của bạn là: " + birth);

		// Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM
		question5();

		// Question 6:Viết lệnh cho phép người dùng tạo department (viết thành method)
		question6();

		// Question 7:Nhập số chẵn từ console
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Hãy nhập vào 1 số chẵn: ");
			int a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.println("Bạm vừa nhập vào:" + a);
				return;
			} else {
				System.out.println("Nhập sai, đây không phải là số chẵn");
			}

			// Question 8:
//		Viết chương trình thực hiện theo flow sau:
//			Bước 1:
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//			dụng"
//			Bước 2:
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//			lại" và quay trở lại bước 1

			Scanner scanInput = new Scanner(System.in);
			int input = scanInput.nextInt();
			while (true) {
				System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
				if (input == 1 || input == 2) {
					switch (input) {
					case 1:
						question8();
						break;
					case 2:
						question6();
						break;
					}
					return;
				} else {
					System.out.println("Mời bạn nhập lại");
				}
			}
		}

		// Question 9:
//		Viết method cho phép người dùng thêm group vào account theo flow sau:
//			Bước 1:
//			In ra tên các usernames của user cho người dùng xem
//			Bước 2:
//			Yêu cầu người dùng nhập vào username của account
//			Bước 3:
//			In ra tên các group cho người dùng xem
//			Bước 4:
//			Yêu cầu người dùng nhập vào tên của group
//			Bước 5:
//			Dựa vào username và tên của group người dùng vừa chọn, hãy
//			thêm account vào group đó 

	}

	public static void question5() {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();

		System.out.println("Mời bạn nhập account cần tạo: ");

		System.out.println("Nhập ID: ");
		acc.accountId = scan.nextInt();
		scan.nextLine();

		System.out.println("nhập email: ");
		acc.email = scan.nextLine();

		System.out.println("nhập userName: ");
		acc.userName = scan.nextLine();

		System.out.println("nhập fullName: ");
		acc.fullName = scan.nextLine();

		System.out.println("nhập vào 1 2 3 4  vào và chương trình sẽ chuyển thành 1.Dev, 2.Test, 3.ScrumMaster, 4.PM");
		int posName = scan.nextInt();
		switch (posName) {
		case 1:
			Position position1 = new Position();
			position1.positionId = 1;
			position1.positionName = PositionName.DEV;
			acc.position = position1;
			break;
		case 2:
			Position position2 = new Position();
			position2.positionId = 2;
			position2.positionName = PositionName.TEST;
			acc.position = position2;
			break;
		case 3:
			Position position3 = new Position();
			position3.positionId = 3;
			position3.positionName = PositionName.SCRUM_MASTER;
			acc.position = position3;
			break;
		case 4:
			Position position4 = new Position();
			position4.positionId = 4;
			position4.positionName = PositionName.PM;
			acc.position = position4;
			break;
		default:
			break;
		}
		System.out.println("Tạo mới account thành công!");
		System.out.println("Account [accountId=" + acc.accountId + ", email=" + acc.email + ", userName=" + acc.userName
				+ ", fullName=" + acc.fullName + ", position=" + acc.position.positionName + "]");
	}

	public static void question6() {
		Scanner scannerD = new Scanner(System.in);
		System.out.println("Mời bạn nhập department cần tạo: ");
		Department dep = new Department();

		System.out.println("Nhập ID: ");
		int depId = scannerD.nextInt();
		scannerD.nextLine();
		System.out.println("Nhập Name: ");
		String depName = scannerD.nextLine();

		System.out.println("department bạn vừa tạo: " + "ID: " + depId + "\n Name: " + depName + "");

	}

	public static void question8() {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();

		System.out.println("Mời bạn nhập account cần tạo: ");

		System.out.println("Nhập ID: ");
		acc.accountId = scan.nextInt();
		scan.nextLine();

		System.out.println("nhập email: ");
		acc.email = scan.nextLine();

		System.out.println("nhập userName: ");
		acc.userName = scan.nextLine();

		System.out.println("nhập fullName: ");
		acc.fullName = scan.nextLine();

		System.out.println("Account [accountId=" + acc.accountId + ", email=" + acc.email + ", userName=" + acc.userName
				+ ", fullName=" + acc.fullName + "]");
	

	

	}
}

package lesson3;

public class Ex3_Ass3 {

	public static void main(String[] args) {
//		Question 1:
//			Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//			Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//			float có 2 số sau dấu thập phân)
		Integer dataType = new Integer(5000);
		System.out.printf("%5.2f", (float) dataType);
		
		//Question 2: Khai báo 1 String có value = "1234567"
				//Hãy convert String đó ra số int
		String value = "1234567";		
		int iValue = Integer.parseInt(value);
		System.out.println("\n" + iValue);

		//Question 3:Khởi tạo 1 số Integer có value là chữ "1234567"
		//Sau đó convert số trên thành datatype int
		Integer in = new Integer("1234567");
		int so = in.intValue();
		System.out.println(so);
		
		
	}

}

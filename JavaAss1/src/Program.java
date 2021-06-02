import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Sale";
		
		System.out.println(department1.toString());
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketting";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Nhân sự";
		
		//create position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.DEV;
		
		System.out.println(position1.toString());
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.DEV;
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = PositionName.TEST;
		
		//create account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "nguyenthuong@gmail.com";
		account1.userName = "Thuong";
		account1.fullName = "Nguyễn Văn Thưởng";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = new Date("2021/05/29");
		
		System.out.println(account1.toString());
		
		Account account2 = new Account();
		account2.accountId = 1;
		account2.email = "thuha@gmail.com";
		account2.userName = "Ha";
		account2.fullName = "Bạch Thu Hà";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date("2021/05/29");
		
		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "thuong@gmail.com";
		account3.userName = "Thuong";
		account3.fullName = "Nguyễn Thưởng";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = new Date("2021/05/29");
		
		
		
		//create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "hihi";
		group1.account = account1;
		group1.createDate = new Date("2021/05/29");
		
		System.out.println(group1.toString());
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "haha";
		group2.account = account2;
		group2.createDate = new Date("2021/05/29");
		
		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "leuleu";
		group3.account = account3;
		group3.createDate = new Date("2021/05/29");
		
		//create groupAccount
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.account = account1;
		GroupAccount1.group = group1;
		GroupAccount1.joinDate = new Date("2021/05/29");
		
		System.out.println(GroupAccount1.toString());
		
		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.account = account2;
		GroupAccount2.group = group2;
		GroupAccount2.joinDate = new Date("2021/05/29");
		
		GroupAccount GroupAccount3 = new GroupAccount();
		GroupAccount3.account = account3;
		GroupAccount3.group = group3;
		GroupAccount3.joinDate = new Date("2021/05/29");
		
		//create typeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = enums.ESSAY;
		
		System.out.println(typeQuestion1.toString());
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = enums.MULTIPLE_CHOICE;
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3;
		typeQuestion3.typeName = enums.ESSAY;
		
		//create categoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "JAVA";
		
		System.out.println(categoryQuestion1.toString());
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "PYTHON";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "RUBY";
		
		//create question
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "câu hỏi về JAVA";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.account = account1;
		question1.createDate = new Date("2021/05/29");
		
		System.out.println(question1.toString());
		
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
		
		//create answer
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "mới học JAVA";
		answer1.isccorect = true;
		answer1.question = question1;
		
		System.out.println(answer1.toString());
		
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
		
		//create exam
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = 1234;
		exam1.title = "hãy làm java";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.account = account1;
		exam1.createDate = new Date("2021/05/29");
		
		System.out.println(exam1.toString());
		
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
		
		//create examQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;
		
		System.out.println(examQuestion1.toString());
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;
		
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;
	}
	}



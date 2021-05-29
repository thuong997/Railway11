import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Sale";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketting";
		
		//create postion
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = Enum.DEV;
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = Enum.DEV;
		
		//create account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "nguyenthuong@gmail.com";
		account1.userName = "Thuong";
		account1.fullName = "Nguyễn Văn Thưởng";
		account1.depaetmentId = department1;
		account1.positionId = position1;
		account1.createDate = new Date("2021-05-29");
		
		Account account2 = new Account();
		account2.accountId = 1;
		account2.email = "thuha@gmail.com";
		account2.userName = "Ha";
		account2.fullName = "Bạch Thu Hà";
		account2.depaetmentId = department2;
		account2.positionId = position2;
		account2.createDate = new Date("2021-05-29");
		
		//create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "hihi";
		group1.accountId = account1;
		group1.createDate = new Date("2021-05-29");
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "haha";
		group2.accountId = account2;
		group2.createDate = new Date("2021-05-29");
		
		//create groupAccount
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.accountId = account1;
		GroupAccount1.groupId = group1;
		GroupAccount1.joinDate = new Date("2021-05-29");
		
		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.accountId = account2;
		GroupAccount2.groupId = group2;
		GroupAccount2.joinDate = new Date("2021-05-29");
		
		//create typeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = enums.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = enums.MULTIPLE_CHOICE;
		
		//create categoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "JAVA";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "PYTHON";
		
		//create question
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "câu hỏi về JAVA";
		question1.categoryId = categoryQuestion1;
		question1.typeId = typeQuestion1;
		question1.accountId = account1;
		question1.createDate = new Date("2021-05-29");
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "câu hỏi về PYTHON";
		question2.categoryId = categoryQuestion2;
		question2.typeId = typeQuestion2;
		question2.accountId = account2;
		question2.createDate = new Date("2021-05-29");
		
		//create answer
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "mới học JAVA";
		answer1.isccorect = true;
		answer1.questionId = question1;
		
		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "mới học PYTHON";
		answer2.isccorect = true;
		answer2.questionId = question2;
		
		//create exam
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = 1234;
		exam1.title = "hãy làm java";
		exam1.categoryId = categoryQuestion1;
		exam1.duration = 60;
		exam1.accountId = account1;
		exam1.createDate = new Date("2021-05-29");
		
		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = 1235;
		exam2.title = "hãy làm python";
		exam2.categoryId = categoryQuestion2;
		exam2.duration = 50;
		exam2.accountId = account2;
		exam2.createDate = new Date("2021-05-29");
		
		//create examQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.examId = exam1;
		examQuestion1.questionId = question1;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.examId = exam2;
		examQuestion2.questionId = question2;
	}
	}



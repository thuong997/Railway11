USE Assignment2;

INSERT INTO Department 	(Department_name)
VALUES 					("Bán hàng"		),
						("Kỹ thuật"		),
						("Marketing"	),
						("Nhân sự"		),
						("Tài chính"	);
        
INSERT INTO Position 	(position_name	)
VALUES					("Dev"			),
						("Test"			),
						("Scrum Master"	),
						("PM"			);

INSERT INTO `Account` 	(Email						, UseName		, FullName				, Department_id		, position_id	, create_date	)
VALUES 					("vanthuong997@gmail.com"	, "Thuong"		, "Nguyễn Văn Thưởng"	, "4"				, "1"			, "2021/05/11"	),
						("buitoan@gmail.com"		, "Toan"		, "Bùi Văn Toản"		, "4"				, "1"			, "2021/05/11"	),
						("oanhdo@gmail.com"			, "OanhOanh"	, "Đỗ Thị Oanh"			, "4"				, "1"			, "2021/05/11"	),
						("nugyencong@gmail.com"		, "Cong"		, "Nguyễn Văn Công"		, "4"				, "1"			, "2021/05/11"	),
						("thenam@gmail.com"			, "Nam"			, "Nguyễn Thế Nam"		, "4"				, "1"			, "2021/05/11"	);
        
INSERT INTO `Group` 	(group_name			, creator_id		, create_date)
VALUES 					("Chém gió"			, "1"				, "2021/05/11"),
						("Tiếng nhật"		, "3"				, "2021/05/11"),
						("VTI Acerami"		, "2"				, "2021/05/11"),
						("Fly"				, "4"				, "2021/05/11"),
						("Idol"				, "5"				, "2021/05/11");

INSERT INTO GroupAccount	(group_id	,account_id		,join_date		)
VALUES 						("1"		,"1"			,"2021-05-11"	),
							("2"		,"3"			,"2021-05-11"	),
							("3"		,"2"			,"2021-05-11"	),
							("4"		,"4"			,"2021-05-11"	),
							("5"		,"5"			,"2021-05-11"	);
        
INSERT INTO TypeQuestion 	(type_name)
VALUES 						("Multiple-Choice"	),
							("Essay"			);
		
INSERT INTO CategoryQuestion 	(category_name	)
VALUES 							("JAVA"			),
								("NET"			),
								("SQL"			),
								("POSTMAN"		),
								("RUBY"			);
        
INSERT INTO Question 	(content			,category_id	, type_id	, creator_id	, create_date	)
VALUES 					('hello'			,"1"			, "1"		, "1"			, "2021/05/11"	),
						('mylove'			,"2"			, "2"		, "3"			, "2021/05/11"	),
						('try me'			,"3"			, "2"		, "2"			, "2021/05/11"	),
						('attention'		,"4"			, "1"		, "4"			, "2021/05/11"	),
						('havana'			,"5"			, "1"		, "5"			, "2021/05/11"	);
        
INSERT INTO Answer 	(content			,question_id		,is_correct		)
VALUES 				("đoàn dự"			,"1"				,true			),
					("hư chúc"			,"3"				,true			),
					("tiêu phong"		,"4"				,false			),
					("hồng thất công"	,"2"				,false			),
					("ngộ không"		,"5"				,false			);
        
INSERT INTO Exam 	(`code`	, title													, category_id	, duration	, creator_id	, create_date	)
VALUES 				("1997"	, "viết chương trình JAVA"								, "1"			, "120"		, "1"			, "2021/05/11" 	),
					("1993"	, "viết chương trình NET"								, "2"			, "120"		, "3"			, "2021/05/11"	),
					("2000"	, "Sự khác biệt giữa lệnh ‘delete’ và ‘truncate’ là gì?", "2"			, "120"		, "2"			, "2021/05/11" 	),
					("1995"	, "POSTMAN là gì?"										, "1"			, "120"		, "4"			, "2021/05/11"	),
					("1998	", "viết chương trình bằng ngôn ngữ RUBY"				, "2"			, "120"		, "5"			, "2021/05/11"	);
        
INSERT INTO ExamQuestion 	(exam_id	, question_id	)
VALUES 						("1"		, "1"			),
							("2"		, "2"			),
							("3"		, "3"			),
							("4"		, "4"			),
							("5"		, "5"			);
        

         
         
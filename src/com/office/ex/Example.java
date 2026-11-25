package com.office.ex;

public class Example {
	
	public static void main(String[] args) {
		
		//변수 정의 = 변수 선언 + 변수 초기화
		//변수 선언
		int num1;
		
		//변수 초기화
		num1 = 5;
		
		System.out.println("num1 :" + num1); //5
		
		//변수 데이터 수정
		num1 = 50;
		
		System.out.println("num1 :" + num1); //50
		
		//정수 : int
		//실수 : float
		//문자 : char
		//문자열 : String
		
		/*
			변수 이름 작명
		*/
		//1. 변수명의 시작은 일반적으로 소문자를 사용한다
		int money = 1000;
		// int Money = 1000;
		
		//2. 변수명은 일반적으로 영문자를 사용한다.
		int myMoney = 500;
		// int 나의돈 = 500;
		
		//3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 작명한다. (많이 중요)
		int score = 100;
		//int s = 100;
		
		String player = "son";
		//String p = "park";
		
		//4. 2개 이상의 단어가 조합된 경우 낙타표기법(카멜 표기법)을 사용한다. (많이 중요)
		int currentLocation;
		int current_location; //스네이크 표기법
		
		
		int myCurrentLocation;
		int my_current_location; //스네이크 표기법
		//int my-Current-Location;
		//int my-current-location;
		
		
		int totalScore;
		int highScore;
		int maxScore;
		String newItem;
		
		//5. 키워드(==예약어)는 변수명으로 사용할 수 없다
		//int public = 100;
		
		//6. '_' or '$'를 제외한 특수문자 사용 금지
		//int score!;
		//int score^^;
		//int score@;
		int s___cor___e;
		int sc$$o$$re;
		
		//__init__
		
		//7. 변수명에는 공백문자는 사용할 수 없다.
		//int my      score;
		
		//8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용할 수 있다.
		int sco7re;
		int score7;
		//int 7score;
		
		/*
		 * 변수명은 영문으로 하고, 첫 글자는 소문자로 한다.
		 * 2개 이상의 단어가 조합된 경우 낙타표기법을 따른다.
		 * 특수문자, 예약어 그리고 공백문자는 사용하지 않는다.
		 * 숫자를 사용해야하는 경우 중간 또는 뒤에 사용한다.
		 */
		
		/*
		 * 변수 데이터 변경 
		 */
		int myNum = 10;
		System.out.println("myNum: "+ myNum); //10
		
		myNum = 20;
		
		int yourNum = myNum; //20 --> 데이터 복사(copy)

		System.out.println("myNum: "+ myNum);		//20
		System.out.println("yourNum: " + yourNum);	//20
		
		yourNum = 200;
		System.out.println("myNum: "+ myNum);		//20
		System.out.println("yourNum: " + yourNum);	//200
		
		// 데이터 스왑(swap)
		int n1 = 10;
		int n2 = 20;
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		/*
		 * n1=20 
		 * n2=10
		 */
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
				
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		//객체 데이터 == 참조 데이터
		//기초 테이터
		
		

	}
	
}

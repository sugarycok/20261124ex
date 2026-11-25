package com.office.ex;

public class DataType {
	
	public static void main(String[] args) {
		
		/*
		 * 데이터 타입(Data type)이란,
		 * 메모리에 데이터가 저장될 떄 데이터에 따라서 할당 받는 메모르 크기가
		 * 다르게 되는데요, 예를 들어 정수는 1~8byte, 실수는 4~8byte의 크기가
		 * 할당 됩니다. 이런것을 데이터 타입이라고 합니다.
		 */
		
		//1. 정수 데이터 타입
		//1-1. byte		1byte		-128 ~ 127
		byte byteVar = 127;
		System.out.println("byteVar: " + byteVar); //127
		//byteVar = 128; (error)
		//byteVar = 129; (error)
		
		//1-2. short	2byte		-32,768 ~ 32,767
		short shortVar = 32767;
		System.out.println("shortVar: " + shortVar);
		//shortVar = 32768; (error)
		
		//1-3. int		4byte		-2,147,483,648 ~ 2,147,483,647
		int intVar = 2147483647;
		System.out.println("intVar: " + intVar);
		
		//1-4. long		8byte		-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (끝에 L을 쓸 것)
		long longVar = 9223372036854775807L;
		System.out.println("longVar: "+longVar);
		
		/*
		 *2. 실수형 데이터 타입 
		 */
		// 2-1 float	4byte
		float floatVar = 3.14f;
		System.out.println("floatVar: " + floatVar);
		
		
		// 2-2 double	8byte
		double doubleVar = 3.1415592;
		System.out.println("doubleVar: " + doubleVar);
		
		/*
		 *3. 논리형(boolean)	1byte	참(true) or 거짓(false) 
		 */
		boolean booleanVar = true;
		System.out.println("booleanVar: " + booleanVar); //true
		
		booleanVar = false;
		System.out.println("booleanVar: " + booleanVar); //false
		
		boolean isMember = true;
		isMember = false;
		
		/*
		 *4. 문자 데이터 타입 
		 *char	2byte
		 */
		char caheVar = 'A';
		System.out.println("caheVar: " + caheVar);
		
		//caheVar = 'AA'; // '' ""
		//caheVar = 'A" (error)
		
		//ckarh
		//빈(empty) 문자, 공백(space) 문자
		//'' --> 빈(empty) 문자
		//' " -> 공백(space) 문자
		
		// char ch1 = '';
		char ch2 = ' ';
		//char ch3 = '  '; (문자열)
		
		//유니코드
		//세상의 모든 문자를 숫자로 표현한것
		
		char char1 = 'A'; // --> 65
		System.out.println("char1: " + char1);
		
		int unicode1 = char1;
		System.out.println("unicode1: " + unicode1);
		
		//char char2 = 65;
		char char2 = 65; // A
		System.out.println("char2: " + char2);
		
		char char3 = 12593; // ㄱ
		System.out.println("char3: " + char3);
		
		/*
		 * char char2 = 65; -> 0100 0001 -> 실행
		 * char char2 = A;  -> 65 -> 0100 0001 -> 실행
		 */
		
		//5. 문자열 String
		String str1 = "Hello";
		System.out.println("str1: " + str1);
		
		str1 = "";
		str1 = " ";
		str1 = "A";
		//str1 = 'A';
		
		// String str2 = new String("Hello");
		String str2 = "Hello";
		
	}

}

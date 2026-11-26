package com.office.ex;

public class Formatter {
	
	public static void main(String[] args) {
		
		// 형식 문자열 출력
		
		//1. 데이터를 형식에 맞춰 출력하기: System.out.printf()
		String name = "Mr. Hong"; // 이름: Mr. Hong
		System.out.println("이름: " + name);
		System.out.printf("이름: %s", name);
		
		/*
		 * %d	:	정수
		 * %f	:	실수
		 * %c	:	문자
		 * %s	:	문자열
		 * %b	:	논리형
		 * %n	:	개행 		==>	\n
		 * 
		 * %o	:	8진수
		 * %	:	16진수
		 */
		
		System.out.println();
		System.out.printf("이름: %s%n", "Mr. Hong");
		System.out.printf("성구분: %c%n", 'W');
		System.out.printf("나이: %d%n", 20);
		System.out.printf("신장: %f%n", 1.88);
		System.out.printf("결혼유무: %b%n", true);
		
		System.out.printf("10진수 123 ==> 8진수 %o%n", 123);
		System.out.printf("10진수 123 ==> 16진수 %x%n", 123);
		
		//지정자를 여러개 사용하기
		System.out.printf("%s, %c, %d, %f, %b%n", "abc", 'A', 10, 3.14, false);
		
		String myName = "Mr.Hong";
		char gender = 'M';
		int age = 50;
		double height = 1.88;
		double weight = 85.0;
		boolean isMarriage = true;
		
		System.out.printf("이름은 %s(%c)dlrh, 나이는 %d살입니다.%n",
				myName, gender, age);
		System.out.printf("키와 몸무게는 %fm, %fkg이고 결혼은 %b입니다.%n",
				height, weight, isMarriage);
		
		// 2. 형식 문자열 옵션
		// 2-1. 소수점 아래 자리수를 지정
		double rate = 3.141592;

		System.out.printf("rate: %f %n", rate);
		System.out.printf("rate: %.2f %n", rate);
		System.out.printf("rate: %.4f %n", rate);
		
		// 2-2. 전체 출력 자리수를 지정하고, 오른쪽 정렬
		int num1 = 1;
		int num2 = 12;
		int num3 = 123;
		
		System.out.printf("num1: %3d%n", num1);
		System.out.printf("num2: %3d%n", num2);
		System.out.printf("num3: %3d%n", num3);
		
		// 2-3 전체 출력 자리수가 지정된 경우 빈간을 0으로 채우기
		int num4 = 1;
		int num5 = 12;
		int num6 = 123;
		
		System.out.printf("num4: %04d%n", num4);
		System.out.printf("num5: %05d%n", num5);
		System.out.printf("num6: %06d%n", num6);
		
		// 2-4 데이터 적용 위치를 지정
		System.out.printf("%3$d, %2$d, %1$d", 1, 2, 3);
		
		// 3. 형식 문자열 반환메서드 String.format()
		System.out.println();
		
		System.out.printf("이름은 %s(%c)이고, 나이는 %d살입니다.%n",
				"Hong", 'M', 20);
		
		// String str = "이름은 Hong(M)이고, 나이는 20살입니다."
		String str = String.format("이름은 %s(%c)이고, 나이는 %d살입니다.%n",
				"Hong", 'M', 20);
		System.out.println(str);

		
	}

}

package com.office.ex;

import java.util.Scanner;

public class InputOutput {
	
	public static void main(String[] args) {
		
		//1. 데이터 출력	System.out.println();
		
		int num = 1000;
		System.out.println(num);	
		
		String str = "Hello";
		System.out.println(str);
		
		System.out.println(10+20);
		
		System.out.println("Hello "+20);	//Hello 20
		int num1 = 20;
		System.out.println("Hello "+num1);	//Hello 20
		
		System.out.print("abc");
		System.out.print(" ");
		System.out.print("def");	// abc  def
		System.out.print("\n");
		System.out.print("ghi");
		
		/*
		 * 특수 문자
		 * \n : 개행
		 * \t : 탭
		 * \' : '
		 * \" : "
		 * \\ : \
		 */
		
		System.out.println("\n");
		
		System.out.println("이름\t학번\n");
		System.out.println("Mr.H\t2020_000123\n");
		System.out.println("Mr.K\t2020_000124\n");
		
		System.out.print("어머님께서는 \"밥먹고 설거지 해놔라.\" 라고 하셨습니다.\n");
		System.out.print("그래서 나는 \'네.\'라고 했습니다.\n");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\"); // 짝수 갯수야 오류 안생김
		System.out.println("\\\\2026-11-26\\\\");
		
		/*
		 *2. 데이터 입력 Scanner 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine(); // abcdef
		System.out.println("str1: " + str1);
		
		/*
		 * nextByte():		정수(byte)		입력
		 * nextInt():		정수(int)			입력
		 * nextLong():		정수(long)		입력
		 * nextFloat():		실수(float)		입력
		 * nextDouble():	실수(double) 		입력
		 * nextLine():		문자열(String)	입력 
		 * nextBoolean(): 	논리(boolean) 	입력
		 */
		
		byte byteNem = scanner.nextByte();
		System.out.println("byteNem: " + byteNem);
		
		int intNum = scanner.nextInt();
		System.out.println("intNum: " + intNum);
		
		long lingNum = scanner.nextLong();
		System.out.println("lingNum: " + lingNum);
		
		float floatNum = scanner.nextFloat();
		System.out.println("floatNum: " + floatNum);
		
		boolean booleanData = scanner.nextBoolean();
		System.out.println("booleanData: " + booleanData);
		
		scanner.close(); //작성하지 않으면 외부와 연결된 통로로 인해 문제 발생할 수 있음(시스템 크기가 클수록 심각)
		
		
		
		
	}
	
}

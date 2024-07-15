package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		//String 기능 중 문자 하나씩 꺼내오는 메소드 : chatAt(위치값)
		
		System.out.println("첫 번째 문자: " + str.charAt(0));
		System.out.println("두 번째 문자: " + str.charAt(1));
		System.out.println("세 번째 문자: " + str.charAt(2));
		
		
	}
}

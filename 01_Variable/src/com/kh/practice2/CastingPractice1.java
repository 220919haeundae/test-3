package com.kh.practice2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CastingPractice1 {

	public static void main(String[] args) {

		// Q. 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자: ");
		
		String str = sc.next();
		
		char ch = str.charAt(0);
		System.out.println(ch + " unicode: " + (int)ch);
		
		IntStream is = str.chars();

		is.forEach(s -> System.out.println((int) s));
		
		
	}

}

package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	TokenController tc = new TokenController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 :
				tokenMenu();
				continue;
			case 2 :
				inputMenu();
				continue;
			case 3 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default: 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;	
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String answer = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + answer);
		System.out.println("토큰 처리 후 개수 : " + answer.length());
		System.out.println("모두 대문자로 변환 : " + answer.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));
		System.out.print("찾을 문자 하나 입력하세요 : ");
		char s = sc.next().charAt(0);
		System.out.println(s + "문자가 들어간 개수 : " + tc.findChar(input, s));
		
	}

}

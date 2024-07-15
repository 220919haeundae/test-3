package com.kh.practice.chap02.last;

import java.util.Scanner;

public class LastPractice {

	public void practice1() {
		System.out.print("정수: ");
		int num = new Scanner(System.in).nextInt();
		
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i%2 != 0) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		} else {
			System.out.print("양수가 아닙니다.");
		}
	}
	
	
	public void practice2() {
		
		while(true) {
			System.out.print("정수: ");
			int num = new Scanner(System.in).nextInt();
			if (num < 1) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					if (i%2 != 0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
			} else {
				System.out.print("양수가 아닙니다.");
			}
			break;
		}
			
	}
	
	public void practice3() {
		
		System.out.print("문자열: ");
		String str = new Scanner(System.in).nextLine();
		System.out.print("문자: ");
		String ch = new Scanner(System.in).nextLine();
		char[] ch1 = ch.toCharArray();
		char ch2 = ch1[0];
		
		int sum = 0;
				
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch2) {
				sum += 1;
			};
		}
		System.out.printf("%s 안에 포함된 %s 개수: %d", str, ch, sum);
		
	}
	
	public void practice3_1() {
		
		System.out.print("문자열: ");
		String str = new Scanner(System.in).nextLine();
		System.out.print("문자: ");
		String ch = new Scanner(System.in).nextLine();
		
		int sum = 0;
				
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch.charAt(0)) {
				sum += 1;
			}
		}
		System.out.printf("%s 안에 포함된 %s 개수: %d", str, ch, sum);
		
	}

	public void practice4() {
		
		outer: while(true) {
		
			System.out.print("문자열: ");
			String str = new Scanner(System.in).nextLine();
			System.out.print("문자: ");
			String ch = new Scanner(System.in).nextLine();
			
			int sum = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch.charAt(0)) {
					sum += 1;
				}
			}
			System.out.printf("%s 안에 포함된 %s 개수: %d\n", str, ch, sum);
			
			while(true) {
				System.out.print("더 하시겠습니까? (y/n): ");
				String str1 = new Scanner(System.in).nextLine();
				if(str1.equals("y") || str1.equals("Y")) {
					continue outer;
				} else if (str1.equals("n") || str1.equals("N")) {
					break outer;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}	
			}
		}
	}
	
	public void practice4_1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("문자열: ");
			String str = sc.nextLine();
			System.out.print("문자: ");
			String ch = sc.nextLine();
			
			int sum = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch.charAt(0)) {
					sum += 1;
				}
			}
			System.out.printf("%s 안에 포함된 %s 개수: %d\n", str, ch, sum);
			
			while(true) {
				System.out.print("더 하시겠습니까? (y/n) : ");
				String str1 = sc.nextLine();
			}
			
		}	
	}
	

	
	
}

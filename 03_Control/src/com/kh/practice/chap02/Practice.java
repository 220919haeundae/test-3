package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice {


	public void method1() {

		//1~10 출력 => 1 2 3 4 5 6 7 8 9 10
		for(int i =1; i < 11; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.print(" ");
			}
		}
		
		System.out.println("\n-----------------------");
		//10~1 출력 => 10 9 8 7 6 5 4 3 2 1
		for (int i = 10; i >0; i--) {
			System.out.print(i + " ");
			if (i != 1) {
				System.out.print(" ");
			}
		}
		
	}
	
	public void method2() {
		//1 ~ 10까지 총 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	
	public void method4() {
		// 랜덤값까지의 총 합을 구하여 출력 ( 1 ~ 10 사이의 랜덤값 )
		/*
		 *  [랜덤값 구하는 방법]
		 *   - - Math : java.alng.Math
		 *   	* random() : 랜덤값을 반환해주는 메소드
		 *   	=> 사용법 : Math.random();
		 *   		값의 범위 : 0.0 ~ 0.99999xx (0.0 <= n < 1.0)
		 *  => 1 ~ 10 사이의 랜덤값
		 *  :(int)(Math.random() * 10 + 1)
		 */
		
		int random = (int)(Math.random()*10 + 1);
		System.out.println(random);
		//random까지의 총합을 구하여 출력 ( 1 ~ random)
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += (int)(Math.random()*10 +1);
		}
		System.out.println(sum);
	}
	
	public void method5() {
		//분기문 : break (반복문 종료시키는 분기문)
		
		// 1 ~ 100 사이의 랜덤값을 추출하여
		// 해당 랜덤 값이 짝수일 때 반복문 종료(종료 전 "종료" 출력)
		// 홀수일 때는 해당 값을 출력
		
		for (;;) {
			int i = (int)(Math.random()*100+1);
			if(i%2 != 0) {
				System.out.println(i);
			} else {
				System.out.println("종료");
				break;
			}
		}
	}
	
	
	public void method6() {
		// 1부터 10까지 정수 중에 짝수만 출력
		// * continue : 반복문 내에서 실행되면 뒤에 코드를 무시하고 증감식이나 조건식으로 이동
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
	

}

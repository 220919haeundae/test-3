package com.kh.review;

import java.util.Arrays;

public class For {
	/*
	 * 반복문 : 특정 코드를 반복적으로 수행
	 * 
	 * - for문
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		// 반복 수행할 코드
	 * }
	 * 
	 * - 실행 순서 : 초기식 - 조건식 - 수행할 코드 - 증감식 - 조건식 - 수행할 코드 - 증감식 - 조건식 - 조건식의 결과가 false이면 반복문 종료
	 * 
	 * * 초기식, 조건식, 증감식 생략 가능. 단, ;은 필수로 입력
	 * 	=> 증감식 생략 : for(초기식; 조건식;) {}
	 * 	=> 조건식 생략 : for(초기식;;증감식) {}
	 * 	=> 초기식 생략 : for(;조건식;증감식 {}
	 * 
	 * - while문
	 * 
	 * 		// [초기식]
	 * 		while(조건식) {
	 * 			//반복 수행할 코드
	 * 			// [증감식]
	 * 		}
	 * 
	 * -------------
	 * 
	 * - do {} while(조건식);문 : 조건에 상관없이 1회 수행 후 조건에 따라 반복
	 * 
	 * 
	 * -------------
	 * 
	 * * 분기문 (break / continue)
	 * 
	 * 		- break : 반복 실행 중 종료하고자 할 때 사용
	 * 		- continue : 뒤에 실행 코드를 무시하고 증감식 또는 조건식으로 이동
	 */
	
	public static void main(String[] args) {

		// 1 ~ 100까지의 총 합(단, 3의 배수이거나 5의 배수일 경우 합산에서 제외)
		int sum = 0;
		for (int i = 1; i <=100 ; i++) {
			if ((i&3) != 0 && (i&5) != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		
	}

}

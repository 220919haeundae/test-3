package com.kh.practice;

import java.util.Scanner;

public class ExceptionRun {
	
	public static void main(String[] args) {
		System.out.println("---------start----------");
		try {
			method1();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		System.out.println("---------end----------");
		
		
	}
	
	
	/*
	 * 1. ArithmeticException
	 *    사용자로부터 2개의 정수를 입력 받고, 첫 번째 입력된 값이 두 번쨰 입력된 값의 배수인지 확인하여
	 *    배수인 경우에는 x는 x의 배수입니다. 출력
	 *    배수가 아닌 경우에는 "x는 x의 배수가 아닙니다. 출력dlr
	 *    (프로그램이 정상적으로 종료될 수 있도록 시작지점에 "------- start--------"
	 *    마지막 지점에 " ------------ 둥 -------------" 출력
	 */
	
	public static void method() throws ArithmeticException {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if((x % y == 0) && ((x > 0 && y > 0) || (x < 0 && y < 0))) {
			System.out.println(x + "는" + y + "의 배수입니다.");
		} else {
			System.out.println(x + "는" + y + "의 배수가 아닙니다.");
		}
		
	}
	
	public static void method1() throws NegativeArraySizeException, ArrayIndexOutOfBoundsException {
		
		
		int len = (int)(Math.random() * (5 -(-5) +1) + (-5));
		
		int[] arr = new int[len];
		
		for(int i = 0; i <= arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(arr.toString());
		
		
		
	}
	
	/* [사용자 정의 예외 클래스 만들기]
	 * - Exception 클래스 상속
	 * - 생성자 (기본/매개변수 1개 -> msg:String)
	 * 
	 * 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외 발생시키기!
	 * 클래스명 : ValueLengthException
	 * - main 메소드에서 예외처리
	 */
	
	public static void method2() throws ValueLengthException {
		
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		
		if(value.length() <= 3) {
			
			throw new ValueLengthException("입력된 길이가 3 이하입니다. 4글자 이상 입력하세요.");
			
		}
			
			
		
		
		
		
	}
	
		
	

}


package com.kh.review;

public class Variable {

	public static void main(String[] args) {

//		printVariable();
		declareVariable();
		
	}
	
	public static void printVariable() {
	/*
	 * 변수의 목적?
	 *  - 데이터(값)를 저장하기 위한 공간
	 *  - 가독성 증가 (변수 이름에 의미 있게 지어줌으로써)
	 *  - 재사용성 증가 (한 번 값을 저장하여 필요할 때마다 변수 이름으로 가져다 사용)
	 *  - 유지보수가 쉬워진다. (한 번 저장해놓은 위치에 값을 변경함으로써)
	 */
		
		// ex) 월급 = 시급 x 근무시간 x 근무일수
		// 	아이유 : 0000원 형식으로 출력
		System.out.println("아이유: " + (9860 * 6 * 14) + "원");
		System.out.println("홍길동: " + (9860 * 8 * 14) + "원");
		System.out.println("차은우: " + (9860 * 6 * 14) + "원");
		System.out.println("카리나: " + (9860 * 6 * 14) + "원");
		
		//변수 사용 시
		int pay = 9860;
		int time = 6;
		int day = 14;
		
		System.out.println("-----------------");
		
		System.out.println("아이유: " + (pay * time * day) + "원");
		System.out.println("홍길동: " + (pay * 8 * day) + "원");
		System.out.println("차은우: " + (pay * time * day) + "원");
		System.out.println("카리나: " + (pay * time * day) + "원");
		
	}

	public static void declareVariable() {
		/*
		 * 변수의 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당/확보
		 * 
		 * [표현법]
		 * 			자료형 변수명;
		 * 
		 * 		- 자료형 : 변수의 크기 및 모양을 지정하는 부분
		 * 		- 변수명 : 변수의 이름을 부여하는 부분(의미 부여)
		 * 
		 * 명명규칙
		 * 		[1] 카멜 케이스 : 소문자로 시작하고, 다른 단어가 이어질 때 첫글자를 대문자로 시작
		 * 			=> 클래스명의 경우 : 대문자로 시작하도록 지어줌
		 * 		[2] 첫글자는 숫자로 시작할 수 없음, 예약어(int, void, private 등등 이미 사용되는 언어들) 사용 불가
		 * 		[3] 특수문자는 '_', '$'만 사용가능함
		 * 		[4] 대소문자를 구분함
		 * 
		 * 주의사항
		 * 		- 같은 영역({}) 안에 동일한 변수명 사용 불가(중복 불가)
		 * 		- 해당 영역 안({//})에서 선언된 변수는 그 영역 안에서만 사용 가능
		 */
		
		int num = 10;
		
		//------------------------------------
		// 1. 논리형(boolean). 논리값(true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println("isTrue의 값: " + isTrue);
		System.out.println("isFlase의 값: " + isFalse);
		
		isTrue = 1+3 > 1; 	//true
		isFalse = 2*3 < 0;	//false
		
		// ---------------
		
		// 2. 숫자형(정수/실수)
		// 2-1. 정수형(소수점 x. 딱 떨어지는 수)
		// 		byte(1) / short(2) / int(4) /long(8)
		byte bNum;
		bNum = -128;//1byte (-128 ~ 127) 
		
		// 2-2. 실수형 (소숫점 o)
		// float (4B) / double (8B)
		float fNum = 0.0f; // 0.0값을 저장
							// 소숫점 7자리까지 표현 가능
							// 값 자체(리터럴)를 저장할 때 값 뒤에 f를 붙여줌
		
		double dNum = 0;	// 소수점 15자리까지 표현 가능. 실수형의 기본 자료형
		
		// -------------------------------
		// 3. 문자형 (char / String)
		// 3-1. 문자
		char ch = 'a';	// 2B
		char kim = '김';	// 
		
		//3-2. 문자열
		String str;		//참조형(참조 자료형)
		str = "aaa";
		
		//--------------------------------
		// 상수 : 변하지 않는 값을 저장하는 공간
		//	[표현법] final 자료형 상수명;
		final int AGE;	// 명명규칙 : 대문자만 사용, 단어 사이는 '_'로 구분
		AGE = 10;
		// AGE = 20;	// 값이 한 번 저장된 이후에 변경 불가능
		
		System.out.println(Math.PI);
		
	}
}

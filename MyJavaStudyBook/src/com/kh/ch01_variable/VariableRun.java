package com.kh.ch01_variable;

public class VariableRun {

	public static void main(String[] args) {
		/*
		 * * 변수를 사용하는 이유
		 *  1) 값에 의미를 부여하기 위해 사용 ( 가독성이 높아짐 )
		 *  2) 한 번 값을 기록하고 필요할 때마다 사용 ( 재사용성이 높아짐 )
		 *  3) 유지보수를 보다 쉽게 할 수 있음
		 *  ---------------------------
		 * * 변수의 선언 : 값을 기록하기 위한 변수를 메모리 공간에 확보(할당) 하는 것
		 * 
		 * 	[표현법]
		 * 		자료형 변수이름;
		 * 		* 자료형 : 변수의 크기와 모양을 지정하는 부분
		 * 		* 변수이름 : 변수의 이름을 붙여주는 부분
		 * 
		 * 	- 변수 선언 시 주의할 점
		 * 		1) 변수의 이름은 소문자로 시작(낙타표기법(카멜케이스)을 지켜야 함. 예약어 사용 불가)
		 * 		2) 같은 영역 안({})에서는 동일한 이름으로 변수 선언 불가 -> 중복 불가
		 * 		3) 해당 영역 안({})에 선언된 변수는 그 영역 안에서만 사용 가능 -> 다른 영역에서는 사용 불가
		 * 		
		 */
		// ---- 자료형 종류 ----
		// 1. 논리형 (논리값 - true/false), 1byte 크기, boolean
		boolean isTrue;	//변수 선언
		boolean isFalse = false; //변수 선언과 동시에 값을 대입(초기화)
		
		isTrue = 1+ 3 > 0;	// 어떤 연산의 결과가 true 또는 false인 경우 연산 결과 값을 저장할 수 있음
		
		//2. 정수형(소숫점 x)
		byte bNum=-128;			// 1byte 크기 (-2^7 ~ 2^7 -1)
		short sNum=1000;		// 2byte 크기 (-2^15 ~ 2^15 -1)
		int iNum = 10000;		// 4byte 크기	 (-2^23 ~ 2^23 -1)
		long lNum = 100000;		// 8byte 크기 (-2^31 ~ 2^31 -1)
		
		// 3. 실수형 (소숫점 O)
		float fNum = 0.0f;		// 4byte 크기. 소숫점 7자리까지 표현 가능.
								// double형과 구분하기 위해 값 뒤에 'f'를 붙여줌.
								
		double dNum = 0.0;		// 8byte 크기. 소숫점 15자리까지 표현 가능.
								// 실수형 기본 자료형.
		
		// 4. 문자형 : 한 글자에 값만 저장할 수 있는 자료형. 작은 따옴표('')로 값을 표현.
		char ch = 'a';			// 2byte 크기.
		char hong;
		hong = '홍';
		// => 컴퓨터에서는 각각의 문자들에 대한 고유한 숫자를 가지고 있음 (ascii code / unicode)
		
		// 5. 문자열 : 한 글자도 저장 할 수 있고, 여러 글자도 저장할 수 있는 자료형. 큰 따옴표("")로 값을 표현.
		String str;
		str = "안녕?";
		
		//저장된 값을 콘솔창에 출력해보자! "변수명 : 저장된 값" 형식으로 출력
		System.out.println("isTrue" + isTrue);
		System.out.println("isFalse" + isFalse);
		System.out.println("bNum" + bNum);
		System.out.println("sNum" + sNum);
		System.out.println("iNum" + iNum);
		System.out.println("lNum" + lNum);
		System.out.println("fNum" + fNum);
		System.out.println("dNum" + dNum);
		System.out.println("ch" + ch);
		System.out.println("hong" + hong);
		System.out.println("str" + str);
		// --------------------------------------------------------------------------
		/*
		 * 상수 : 변하지 않는 수(값)
		 * 
		 * [표현법] final 자료형 상수이름;
		 */
		final int MAX_SIZE;		// 대문자만 사용, 단어 사이는 언더바(_)로 구분.
		MAX_SIZE = 1024;
		//MAX_SIZE = 1024*10;	// 한 번 저장을 하면 변경이 불가능
		
		// ----------------------------------------
		/*
		 * * 형변환 : 값의 자료형을 바꾸는 것
		 * 
		 * * 컴퓨터에서의 처리(연산) 규칙 ( --> 형변환이 필요한 상황)
		 * 	1) 대입 연산자 기준 왼쪽과 오른쪽이 같은 자료형이어야 함
		 * 		=> 같은 자료형의 변수에 해당하는 값을 대입해야 한다.
		 * 		=> 다른 자료형의 값을 대입하고자 한다면 형변환이 필요함
		 * 		자료형 변수명 = (자료형)값;
		 * 		int num = (int) 3.14;
		 * 
		 *  2) 같은 자료형끼리만 연산 가능
		 *  	값 + 값		// 두 개의 값이 모두 같은 자료형이어야 함
		 *  * 형변환의 종류
		 *   1) 자동 형변환 	=> 자동으로 형변환이 진행됨
		 *   				=> 값의 범위가 작은 자료형과 큰 자료형의 연산 시 
		 *   					작은 자료형의 값이 큰 자료형으로 자동으로 변환된 후 연산이 수행됨
		 *   2) 강제(명시적) 형변환 => 자동 형변환이 되지 않는 경우 직접 형변환을 해야함
		 *   	- (바꿀 자료형)값/변수;
		 *   
		 * 
		 */
		// int(4byte) --> double(8byte) : 자동 형변환
		int i1 = 11;
		double d1 = i1;
		System.out.println(d1);
		

		
		
		int i2 = ++i1;
		int i3 = i1++;
		int i4 = i1++ * 5;
		
		
	}

}

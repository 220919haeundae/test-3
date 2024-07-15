package com.kh;

import java.util.Scanner;

public class VariablePractice0 {

	public static void main(String[] args) {
		/*
		 * 에제 1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기,
		 * - 연도에 해당하는 값을 정수형(int) 타입의 year 이름의 변수로 선언
		 * - 현재 연도를 year 변수에 대입
		 * - 나이에 해당하는 값을 정수형 타입의 age 이름의 변수로 선언
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//변수를 사용하지 않은 경우
		System.out.println("[1] 현재 2024년이고, 올해 20살입니다.");
		
		//변수 선언 및 대입
		
		System.out.print("연도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("[2] 현재 %d년이고, 올해 %d살입니다.\n", year, age);
		
		// -----------------------------------------------------------
		/*
		 * *변수명 명명규칙*
		 * - 카멜케이스 : 처음은 소문자로 시작하고, 다음 단어의 첫글자를 대문자로 작성
		 * - 숫자로 시작하면 안 된다.
		 * - 특수문자는 '_', 와 '$'만 사용 가능하다.
		 * - 예약어(이미 정의되어 있는 단어.. int/false/boolean...)
		 * - 대소문자가 구분되며 길이 제한이 없다.
		 */
		// -----------------------------------------------------------
		/*
		 * *상수(final) : 변하지 않는 값을 저장하는 공간*
		 * - final 예약어를 사용
		 */
		// ex) "몸무게가 80kg 이상인 경우 탑승을 못합니다." -> 상수명 limit weight
		// 상수 선언
		
		// 상수를 사용하여 메세지 출력
		
		final double LIMIT_WEIGHT;
		LIMIT_WEIGHT = 80;
		
		System.out.println("몸무게가 " + LIMIT_WEIGHT +"kg " + "이상인 경우 탑승을 못합니다.");
		
		// -----------------------------------------------------------
		/*
		 * *형변환 : 연산을 할 때 자료형의 종류가 다른 경우 형변환이 발생한다.*
		 *  - 자동형변환 규칙
		 *   [1] 값의 범위가 작은 범위에서 큰 범위로 형변환 발생
		 *   [2] 정수형과 실수형의 연산 시에는 정수형에서 실수형으로 형변환 발생
		 */
		
		int num1 = 10;
		double dNum1 = 5.5;
		
		// num1 변수가 자동형변환 발생 (int -> double)
		System.out.println(num1 + dNum1); // 결과 => 15.5
		//dNum1 변수를 강제 형변환 (double -> int)
		System.out.println(num1 + (int)dNum1); // 결과 => 15
		
		//char <--> int
		char ch = 'A';
		System.out.println(ch); //결과 => A
		System.out.println((int) ch);

		//char(2B) int(4B)
		System.out.println(ch + 3); // => 68
		
		System.out.println((char)(ch + 3)); // => 68
	}
}

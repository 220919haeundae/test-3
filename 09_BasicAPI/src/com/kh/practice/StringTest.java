package com.kh.practice;

public class StringTest {

	public static void main(String[] args) {

		test2();
		
	}
	
	
	public static void test2() {
		// 1) equals : 문자열.equals(문자열B) => 문자열 A와 문자열 B가 같은가?
		
		String str = "Hello";
		System.out.println("[1]" + str.equals("Hello"));
		System.out.println("[2]" + str.equals("Bye"));
		
		
		// 2) charAt : 문자열.charAt(인덱스) : char => 해당 문자열에서 인덱스 위치의 문자 값을 char 타입으로 반환
		System.out.println("[3] " + str.charAt(1));	// 'e'값을 출력
		// 3) length : 문자열.length() : int => 해당 문자열의 길이를 반환
		System.out.println("[4] " + str.length());
		// => str 변수의 마지막 문자 출력
		try {
			System.out.println("[5] " + str.charAt(str.length() - 1));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// 4) toUpperCase : 문자열.toUpperCase() : String => 해당 문자열의 값을 모두 대문자로 변환하여 반환
		//	  toLowerCase : 문자열.toLowerCase() : String => 해당 문자열의 값을 모두 소문자로 변환하여 반환
		
		System.out.println("[6] " + str.toUpperCase());
		System.out.println("[7] " + str.toLowerCase());
		
		// 5) contains : 문자열A.contains(문자열B) : boolean => 문자열A에 문자열B가 포함되어 있는가?
		
		System.out.println("[8] " + str.contains("el"));
		System.out.println("[9] " + str.contains("bb"));
		
		// 6) indexOf : 문자열A.indexOf(문자열B) : int => 문자열A에 문자열B의 시작 인덱스 위치를 반환
		System.out.println("[10] " + str.indexOf("el"));
		System.out.println("[10] " + str.indexOf("bb"));
		
		// 7) substring : 문자열.substring(인덱스) : String => 문자열에서 해당 인덱스를 기준으로 문자열을 잘라서 새로운 문자열로 반환
		//				  문자열.substring(시작 인덱스, 종료 인덱스) : String => 시작인덱스부터 종료인덱스 직전까지
		System.out.println("[12] " + str.substring(2));
		System.out.println("[12] " + str.substring(0, str.length()-1));
		
		// 8) repeat : 문자열.repeat(개수) : String => 해당 문자열을 개수만큼 반복
		
		System.out.println("배고파".repeat(5));
		
		// 9) split : 문자열.split(대상문자) : String[] => 해당 문자열을 대상문자열 기준으로 분리하여 배열형태로 반환
		String str2 = "카레, 돈가스, 밥, 김치, 닭갈비";
		String[] menus = str2.split(", ");
		for(String s : menus) {
			int i = 1;
			System.out.println(i + "번째 메뉴 : " + s);
		}
		
	}
	
	
	
//	public static void test1() {
//		String str1 = "apple";
//		String str2 = "apple";
//		
//		// str1 == str2 : 문자열 값을 비교하는게 아니라, 주소값을 비교
//		System.out.println("[1]" + (str1 == str2));
//		
//		
//		System.out.println("[2]" + (str1 == "apple"));
//		//--------------------------------------------
//		
//		System.out.println("=".repeat(10));
//		String str5 = "Hello";
//		String str6 = "World";
//		
//		System.out.println("[5] " + str5);
//		System.out.println("[6] " + str5.toString());
//		
//		//System.identityHashCode("Hello"); : System클래스 내에서 해쉬값(주소값)을 확인하는 기능을 제공하는 메소드
//		int hash = System.identityHashCode(str5);
//		
//		System.out.println("[7] " + hash);
//		
//		str5 = str5.concat(str6);
//		
//		System.out.println("[8] " + str5);
//		
//		
//		int hash2 = System.identityHashCode(str5);
//
//		System.out.println("[9] " + hash2);
//		String str7 = "HelloWorld";
//		System.out.println("[10] " + System.identityHashCode(str7));
//	}
	
	

}

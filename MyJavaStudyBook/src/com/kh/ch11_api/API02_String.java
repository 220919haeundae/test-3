package com.kh.ch11_api;

import java.util.StringTokenizer;

public class API02_String {

	public static void main(String[] args) {
		// java.lang.String
		System.out.println("==== java.lang.String ====");
		
		String str = "Hello, World!";

		// charAt(idx) : 해당 인덱스의 문자를 char타입으로 반환
		System.out.println("인덱스 7번 위치 문자 : " + str.charAt(7));
		
		// 문자열A.concat(문자열B) : String
		// => 문자열이랑 전달된 문자열을 합쳐서 새로운 문자열로 반환
		System.out.println(str.concat("###"));
		
		//문자열.toCharArray() : char[]
		// => 문자열을 문자형 배열로 반환
		char [] chArr = str.toCharArray();
		for(int i = 0; i< chArr.length; i++) {
			System.out.println(i + "번째 : " + chArr[i]);
		}
		
		//문자열.toUppercase() : String
		// => 문자열을 모두 대문자로 변환하여 반환
		//문자열.toLowerCase() : String
		// => 문자열을 모두 소문자로 변환하여 반환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//--------------------------------------
		String language = "Java,Oracle,JDBC,HTML,CSS,JS,Spring";
		
		// 1) 문자열.split(구분자) : String[]
		String[] lArr = language.split(",");
		System.out.println("langs 배열의 길이 : " + lArr.length);
		
		for(String lang : lArr) {
			System.out.println(lang);
		}
		//2)StringTokenizer 클래스 사용
		StringTokenizer st = new StringTokenizer(language, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
				
	}

}

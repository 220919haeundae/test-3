package com.kh.practice;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String data = "name:Hong,phone:010-1234-5678,address:gangnam,email:twwt0912@naver.com";
		String[] dArr = new String[4];
		
		StringTokenizer st = new StringTokenizer(data,",");
		
		int i = 0;
		while(st.hasMoreTokens()) {
			if(i == 4) {
				break;
			}
			StringTokenizer str1 = new StringTokenizer(st.nextToken(), ":");
			str1.nextToken();
			dArr[i] = str1.nextToken();
			i++;
		}
		
		
		
		
		System.out.printf("이름은 %s이고, 연락처는 %s이고, 주소는 %s이고, 이메일은 %s입니다.", dArr[0], dArr[1], dArr[2], dArr[3]);
		
		
	}
	
	public static void test1() {
		
		// StringTokenizer : 문자열 내에 특정 구분자로 나눠주는 클래스(토큰화)
		
				String msg = "안녕하세요|나는이요셉입니다|반갑습니다";
				
				String[] arr = new String[3];
				
				StringTokenizer st = new StringTokenizer(msg, "|");
				
				int index = 0;
				//토큰화 가능 여부 체크 : 변수명.hasMoreTokens()
				while(st.hasMoreTokens()) {
					// 기준 문자열로 분리하여 데이터를 가져오고자 할 때 : 변수명.nextToken() : String
					arr[index] = st.nextToken();
					System.out.println(arr[index]);
					
					index++;
				}
		
	}

}

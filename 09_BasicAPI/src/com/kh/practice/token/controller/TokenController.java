package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	
	public String afterToken(String str) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
	
	
	public String firstCap(String input) {
		String str = String.format("%c", input.charAt(0)).toUpperCase() + input.substring(1);
		return str;
	}
	
	public int findChar(String input, char one) {
		int isTrue = 1;
		int count = 0;
		while(isTrue > 0) {
			if(input.indexOf(one) > 0) {
				count++;
				input = input.substring(input.indexOf(one)+1);
			} else {
				break;
			}
		}
		return count;
			
	}
		
		
		

}

package com.kh.practice.numRange.controller;

import java.util.Scanner;

import com.kh.practice.numRange.exception.NumberRangeException;

public class NumberController {
	
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		boolean answer = false;
		
		if (num1 >= 100 || num2 >= 100) {
			throw new NumberRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		
		if((num1 % num2 == 0) && ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 <0))) {
			answer = true;
		} else {
			answer = false;
		}
		
		
		return answer;
	}

}

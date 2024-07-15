package com.kh.practice.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 스택(Stack) : LIFO (Last In First Out)
 * 				제일 마지막에 저장된 데이터가 제일 처음으로 사용할 수 있는 구조
 * 
 *  - 데이터 추가 : 순서대로 추가 (끝에 추가)
 *  - 데이터 제거 : 마지막 위치부터 제거
 */

/*-------------
 *  MyStack
 * ------------
 * - arrStack : ArrayList<String> = new ArrayList<>();
 * ------------
 * + push(data:String) : void	// 데이터 추가
 * + pop() : String				// 데이터 제거
 * 								// isEmpty() => 데이터가 없을 겨우 '리스트가 비었습니다.' 반환
 * 								// remove() => arrStack에서 데이터 제거 후 해당 데이터를 반환
 * ------------
 */

public class MyStack {
	List<String> arrStack = new ArrayList<String>();
	
	public void push(String data) {
		arrStack.add(data);
	}
	
	public String pop() {
		if(arrStack.size() == 0) {
			return "리스트가 비었습니다.";
		}
		String s = arrStack.remove(arrStack.size()-1);
		return s;
	}
}

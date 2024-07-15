package com.kh.ch04_array;

public class ArrayRun {

	public static void main(String[] args) {
		/*
		 * 
		 * 	- 변수 : 하나의 공간에 하나의 값을 저장
		 *  - 배열 : 하나의 공간에
		 */
//		double[] dArr = new double[5];
//		for(int i = 0; i < dArr.length; i++) {
//			System.out.println(dArr[i]);
//		}
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			System.out.println("arr["+i+"] : "+ arr[i]);
		}
	}
}

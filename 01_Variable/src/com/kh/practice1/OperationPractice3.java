package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double ko = sc.nextDouble();
		System.out.print("영어: ");
		double en = sc.nextDouble();
		System.out.print("수학: ");
		double math = sc.nextDouble();
		
		int total = (int)(ko + en + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/3);
	}

}

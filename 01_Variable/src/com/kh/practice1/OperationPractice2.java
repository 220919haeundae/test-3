package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice2 {

	public static void main(String[] args) {
		double x;
		double y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		x = sc.nextDouble();
		System.out.print("세로: ");
		y = sc.nextDouble();
		
		System.out.printf("면적: %.2f \n", x * y);
		System.out.printf("둘레: %.2f", 2*(x + y));
	}
}
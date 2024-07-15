package com.kh.example.practice3.model.vo;

public class Circle {

	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {}
	
	public void incrementRadius(int n) {
		
		radius += n;
		
	}
	public double getAreaOfCircle() {
		return PI*radius*radius;
	}
	
	public double getSizeOfCircle() {
		return 2*PI*radius;
	}
	
}

package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c;
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "둘레: " + c.toString() + " / " + Math.PI * c.getRadius() * c.getRadius() + "";
	}
	
	public String calcPerimeter(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "둘레: " + c.toString() + " / " + Math.PI * c.getRadius() * 2 + "";
	}

}

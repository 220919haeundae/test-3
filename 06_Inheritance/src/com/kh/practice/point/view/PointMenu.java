package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
		
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int mNum = sc.nextInt();
			if(mNum == 1) {
				circleMenu();
			} else if(mNum == 2) {
				rectangleMenu();
			} else {
				System.out.print("종료합니다.");
				break;
			}
			
		}
		
		
		
	}
	
	public void circleMenu() {
		
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호: ");
		int num = sc.nextInt();
		if(num == 1) {
			calcCircum();
		} else if(num == 2) {
			
			calcCircleArea();
			
		} else {
			return;
		}
			
	}
	
	public void rectangleMenu() {
		
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호: ");
		int num = sc.nextInt();
		if(num == 1) {
			
			calcPerimeter();
			
		} else if(num == 2) {
			
			calcRectangle();
			
		} else {
			return;
		}
		
	}
	
	public void calcCircum() {
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int r = sc.nextInt();
		System.out.println(cc.calcPerimeter(x, y, r));
		
		
	}
	
	public void calcCircleArea() {
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int r = sc.nextInt();
		System.out.println(cc.calcArea(x, y, r));
		
		
	}
	
	public void calcPerimeter() {
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("높이: ");
		int h = sc.nextInt();
		System.out.print("너비: ");
		int w = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, h, w));
		
		
	}
	
	public void calcRectangle() {
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("높이: ");
		int h = sc.nextInt();
		System.out.print("너비: ");
		int w = sc.nextInt();
		System.out.println(rc.calcArea(x, y, h, w));
		
		
	}
	

}

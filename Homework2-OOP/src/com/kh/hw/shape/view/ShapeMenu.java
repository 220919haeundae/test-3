package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.print("3. 삼각형\n4. 사각형\n9. 프로그램 종료\n메뉴 번호: \n");
			int mNum = sc.nextInt();
			
			if(mNum == 3) {
				triangleMenu();
			} else if(mNum == 4) {
				squareMenu();
			} else if(mNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				
			}
		}
		 
		
		
	}
	
	public void triangleMenu() {
		while(true) {
			System.out.println("===== 삼각형 =====");
			System.out.print("1. 삼각형 면적\n2. 삼각형 색칠\n3. 삼각형 정보\n9. 메인으로\n메뉴 번호: ");
			int tNum = sc.nextInt();
			if(tNum == 1) {
				System.out.print("높이: ");
				double height = sc.nextDouble();
				System.out.print("너비: ");
				double width = sc.nextDouble();
				System.out.printf("삼각형 면적: %f\n", tc.calcArea(height, width));
			}else if(tNum == 2) {
				System.out.print("색깔을 입력하세요: ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.print("\n색이 수정되었습니다.");
			} else if(tNum == 3) {
				System.out.println(tc.print());
			} else if(tNum == 9) {
				System.out.print("\n메인으로 돌아갑니다.");
				break;
			}
		}
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("===== 사각형 =====");
			System.out.print("1. 사각형 둘레\n2. 사각형 면적\n3. 사각형 색칠\n4. 사각형 정보\n9. 메인으로\n메뉴 번호: ");
			int sNum = sc.nextInt();
			if(sNum == 1) {
				System.out.print("높이: ");
				double height = sc.nextDouble();
				System.out.print("너비: ");
				double width = sc.nextDouble();
				System.out.printf("사각형 둘레: %f\n", scr.calcPerimeter(height, width));
			}else if(sNum == 2) {
				System.out.print("높이: ");
				double height = sc.nextDouble();
				System.out.print("너비: ");
				double width = sc.nextDouble();
				System.out.printf("사각형 둘레: %f\n", scr.calcArea(height, width));
			} else if(sNum == 3) {
				System.out.print("색깔을 입력하세요: ");
				sc.nextLine();
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			} else if(sNum == 4) {
				System.out.println(scr.print());
			} else if(sNum == 9) {
				break;
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if (type == 3) {
			
		}
	}
	
	public void printInformation(int type) {
		
	}

}

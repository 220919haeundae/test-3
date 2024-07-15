package com.kh.view;

import java.util.Scanner;
import com.kh.controller.PlayController;

public class DisplayMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PlayController pc = new PlayController();
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("===== Console Game =====");
			System.out.println("1. Up & Down");
			System.out.println("2. 가위바위보");
			System.out.println("3. 숫자 야구");
			System.out.println("7. 기록 불러오기");
			System.out.println("8. 기록 저장");
			System.out.println("9. 점수 조회");
			System.out.println("0. 게임 종료");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : 
				
				pc.game01();
				break;
			case 2:
				System.out.print("가위 / 바위/ 보 중 하나를 입력하세요 : ");
				String s = sc.next();
				pc.game02(s);
				break;
			case 3 : 
				pc.game03();
				break;
			case 7 : 
				System.out.print("사용자 이름을 입력하세요: ");
				String s1 = sc.nextLine();
				pc.load(s1);
				break;
			case 8 : 
				System.out.print("사용자 이름을 입력하세요: ");
				String name = sc.nextLine();
				pc.save(name);
				break;
			case 9 :
				pc.getUserInfo();
					break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				default : 
					System.out.println("다시 선택해주세요.");
			}
		}
	}
}

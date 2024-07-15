package com.kh.practice.phonebook.view;

import java.util.Scanner;

import com.kh.practice.phonebook.controller.PhoneBookController;
import com.kh.practice.phonebook.model.vo.PhoneBook;

public class PhoneBookMenu {
	PhoneBookController pbc = new PhoneBookController();
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		while(true) {
		
			System.out.println("1. 전화번호부 사이즈 결정");
			System.out.println("2. 정보 추가");
			System.out.println("3. 전화번호부 읽기");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 파일로 저장");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				createPhoneBook();
				break;
			case 2:
				addPhoneBook();
				break;
			case 3:
				readPhoneBook();
				break;
			case 4:
				deletePhoneBook();
				break;
			case 5 : 
				savePhoneBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				default :
					
					
			}
		}
		
		
	}
	
	
	public void createPhoneBook() {
		System.out.print("만들 전화전호부 사이즈를 입력하세요: ");
		int size = sc.nextInt();
		sc.nextLine();
		pbc.createPhoneBook(size);
		System.out.printf("크기 %d의 전화번호부가 생성되었습니다.", size);
	}
	
	public void addPhoneBook() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone_Number = sc.nextLine();
		System.out.print("소속 : ");
		String belong = sc.nextLine();
		System.out.print("이메일 주소 : ");
		String email = sc.nextLine();
		System.out.print("메모 : ");
		String memo = sc.nextLine();
		pbc.addPhoneBook(new PhoneBook(name, phone_Number, belong, email, memo)); 
		
	}
	
	public void readPhoneBook() {
		String[] p = pbc.read();
		for(String s : p) {
			if(s != null) {
				System.out.println(s);
			} else {
				System.out.println("끝까지 읽었습니다.");
				break;	
			}
			
		}
	}
	
	public void deletePhoneBook() {
		System.out.print("전화번호부에서 삭제할 사람의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		pbc.phoneBookDelete(name);
	}
	
	public void savePhoneBook() {
		System.out.print("저장할 파일 명을 입력하세요");
		String file = sc.nextLine();
		pbc.savePhoneBook(file);
	}

}

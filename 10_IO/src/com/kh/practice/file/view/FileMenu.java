package com.kh.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 :
				fileSave();
				break;
			case 2 :
				fileOpen();
				break;
			case 3 : 
				fileEdit();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
		}
		
		
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			} else {
				sb.append(str + "\n");
			}
		}
		System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		while(true) {
			String str = sc.nextLine();
			File file = new File("./resources", str);
			if(file.exists()) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char c = sc.next().charAt(0);
				sc.nextLine();
				if(c == 'y' || c == 'Y') {
					fc.fileSave(str, sb);
					break;
				} else if(c == 'n' || c == 'N') {
					System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
					continue;
				} else {
					System.out.println("잘못 입력했습니다. 파일명부터 다시 입력해주세요.");
				}
			} else {
				fc.fileSave(str, sb);
				break;
			}
			
		}
		
		
	}
	
	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String str = sc.nextLine();
		boolean isTrue = fc.checkName(str);
		if(isTrue) {
			System.out.println(fc.fileOpen(str));
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
		
	}
	
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String file = sc.nextLine();
		boolean isTrue = fc.checkName(file);
		if(!isTrue) {
			System.out.println("없는 파일입니다.");
		} else {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.println("내용 : ");
				String str = sc.nextLine();
				if(str.equals("ex끝it")) {
					break;
				} else {
					sb.append(str + "\n");
				}
			}
			fc.fileEdit(file, sb);
		}
		
		
	}
	

}

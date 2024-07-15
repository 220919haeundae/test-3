package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("========== KH 사이트 ==========");
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 회원가입");
			
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : 
				joinMembership();
				break;
			case 2 : 
				login();
				memberMenu();
				break;
			case 3 :
				sameName();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
				default :
					System.out.println("메뉴번호를 잘못 입력했습니다. 다시 입력해주세요.");
					continue;
			}
		}
		
	}
	
	public void memberMenu() {
		
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1: 
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃되었습니다.");
				return;
				default :
					System.out.println("메뉴번호를 잘못 입력했습니다. 다시 입력해주세요.");
					continue;
			}
		}
	}
	
	public void joinMembership() {
		System.out.print("ID를 입력하세요 : ");
		String ID = sc.nextLine();
		System.out.print("password를 입력하세요 : ");
		String password = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		if(mc.joinMembership(ID, new Member(password, name))) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	
	public void login() {
		while(true) {
			System.out.print("ID를 입력하세요 : ");
			String ID = sc.nextLine();
			System.out.print("password를 입력하세요 : ");
			String password = sc.nextLine();
			String name = mc.logIn(ID, password);
			if(name != null) {
				System.out.println(name + "님 환영합니다!");
				memberMenu();
				break;
			}else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다. 다시 입력해주세요");
				continue;
			}
		}
	}
	
	public void changePassword() {
		System.out.print("ID를 입력하세요 : ");
		String ID = sc.nextLine();
		System.out.print("현재 password를 입력하세요 : ");
		String password = sc.nextLine();
		System.out.print("변경할 password을 입력하세요 : ");
		String changed_Password = sc.nextLine();
		if(mc.changePassword(ID, password, changed_Password)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
			memberMenu();
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}
	
	public void changeName() {
		String name;
		String ID;
		String password;
		String changed_Name;
		while(true) {
			System.out.print("ID를 입력하세요 : ");
			ID = sc.nextLine();
			System.out.print("현재 password를 입력하세요 : ");
			 password = sc.nextLine();
			if((name = mc.logIn(ID, password)) != null) {
				System.out.print("현재 사용자 이름: " + name);
				break;
			} else {
				System.out.println("없는 아이디입니다. 다시 입력해주세요.");
				continue;
			}
		}
		System.out.print("변경할 이름을 입력해주세요 : ");
		changed_Name = sc.nextLine();
		boolean t = mc.changeName(ID, changed_Name);
		if(t) {
			System.out.println("이름 변경에 성공했습니다.");
			memberMenu();
		} else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
		}
	}
	
	public void sameName() {
		System.out.print("검색할 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		TreeMap<String, Member> tr = mc.sameName(name);
		Set<String> keySet = tr.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(tr.get(key).getName() +"-"+ key);
		}
 		
	}

}

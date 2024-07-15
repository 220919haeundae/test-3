package com.kh.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.kh.model.vo.User;

public class PlayController {
	private Scanner sc = new Scanner(System.in);
	User user = new User("이요셉");
	
	public void game01() {
		int r = (int)(Math.random()*50 + 1);
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num == r) {
				System.out.println("Catch");
				user.setScore(user.getScore() + 10);
				return;
			} else if(num > r) {
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
		}
		System.out.println("실패했습니다.");
		user.setScore(user.getScore() - 10);
	}
	
	public void game02(String s) {
		int r = (int)(Math.random()*3 + 1);
		String com = null;
		switch(r) {
		case 1 :
			com = "가위";
			break;
		case 2 :
			com = "바위";
			break;
		case 3 :
			com = "바위";
			break;
		}
		if (s.equals(com)) {
			System.out.println("무승부입니다.");
		} else if(s.equals("가위")) {
			if(com.equals("바위")) {
				System.out.println("졌습니다.");
				user.setScore(user.getScore() - 10);
			} else {
				System.out.println("이겼습니다.");
				user.setScore(user.getScore() + 10);
			}
		} else if(s.equals("바위")) {
			if(com.equals("가위")) {
				System.out.println("이겼습니다.");
				user.setScore(user.getScore() + 10);
			} else {
				System.out.println("졌습니다.");
				user.setScore(user.getScore() - 10);
			}
		} else if(s.equals("보")) {
			if(com.equals("가위")) {
				System.out.println("졌습니다.");
				user.setScore(user.getScore() - 10);
			}else {
				System.out.println("이겼습니다.");
				user.setScore(user.getScore() + 10);
			}
		}
	}
	
	public void game03() {
		int r = 10 + (int)(Math.random()*89);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if((r==num)) {
				System.out.println("이김");
				user.setScore(user.getScore() + 10);
				return;
			} else if ((r >= 10 && num >= 10)||(r < 10 && num < 10)) {
				System.out.println("볼");
			}
		}
		System.out.println("패배");
		user.setScore(user.getScore() - 10);
	}
	
	public void save(String user1) {
		File file = new File(user1 +".txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(user);
			System.out.println("기록이 저장되었습니다.");
		} catch(FileNotFoundException e) {
			System.out.println("파일 경로를 찾을 수 없습니다.");
		} catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void load(String user1) {
		File file = new File(user1 + ".txt");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			user = (User)ois.readObject();
			
		}catch(FileNotFoundException e) {
			System.out.println("저장된 정보를 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("저장된 정보 불러오기에 실패했습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("해당하는 정보를 찾을 수 없습니다.");
		}
	}
	
	public void getUserInfo() {
		System.out.println(user);
	}
}
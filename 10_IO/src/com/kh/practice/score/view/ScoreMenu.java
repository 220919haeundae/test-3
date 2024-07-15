package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호");
			int num = sc.nextInt();
			switch(num ) {
			case 1 : 
				saveScore();
				break;
			case 2 : 
				readScore();
				break;
			case 9 :
				System.out.println(" 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
		
		
	}
	
	
	
	public void saveScore() {
		int num = 0;
		while(true) {
			num++;
			System.out.println(num+"번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			int sum = kor + eng + math;
			double avg = (double)sum / 3; 
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			String answer = sc.next();
			if(answer.equals("N") || answer.equals("n")) {
				break;
			}
		}
	}
	
	
	public void readScore() {
		DataInputStream dis = null;
		int sumAll = 0;
		double avgAll = 0.0;
		int count = 0;
		try {
			dis = scr.readScore();
			
			
			while(true) {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < 3; i++) {
					char c;
					if((c = dis.readChar()) == -1) {
						return;
					};
					sb.append(c);
				}
				count += 1;
				System.out.print(sb.toString() + "\t");
				System.out.print(dis.readInt() + "\t");
				System.out.print(dis.readInt() + "\t");
				System.out.print(dis.readInt() + "\t");
				int a = dis.readInt();
				sumAll += a;
				System.out.print(a + "\t");
				double b = dis.readDouble();
				avgAll += b;
				System.out.print(b + "\n");
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.print(count + "\t");
			System.out.print(sumAll + "\t");
			System.out.print(avgAll/count + "\n");
			try{
				dis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
	}

}

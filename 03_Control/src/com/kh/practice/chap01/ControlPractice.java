package com.kh.practice.chap01;
import java.util.Scanner;

public class ControlPractice {

	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 입력\n 2. 수정 \n 3. 조회 \n 4. 삭제 \n 7. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		int menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (menu == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (menu == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (menu == 7) {
			System.out.println("종료 메뉴입니다.");
		} else {
			System.out.println("없는 메뉴입니다.");
		}
		sc.close();
	}
	
	public void practice1_1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 입력\n 2. 수정 \n 3. 조회 \n 4. 삭제 \n 7. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("종료 메뉴입니다."); break;
		default : System.out.println("없는 메뉴입니다.");
		sc.close();
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		if (num >= 0 && num % 2 == 0) {
			System.out.print("짝수다");
		} else if (num >= 0 && num % 2 != 0) {
			System.out.print("홀수다");
		} else {
			System.out.print("양수만 입력해주세요");
		}
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int ko;
		int en;
		int math;
		int total;
		double average;
		
		System.out.print("국어 점수: ");
		ko = sc.nextInt();
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		System.out.print("영어 점수: ");
		en = sc.nextInt();
		
		total = ko + en + math;
		average = (double)total / 3;
		
		if (ko >= 40 && en >= 40 && math >= 40 && average >= 60) {
			System.out.print("축하합니다, 합격입니다!");
		} else {
			System.out.print("불합격입니다.");
		}
		
		sc.close();
	}
	
	public void practice3_1() {
		Scanner sc = new Scanner(System.in);
		int ko;
		int en;
		int math;
		int total;
		double average;
		
		System.out.print("국어 점수: ");
		ko = sc.nextInt();
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		System.out.print("영어 점수: ");
		en = sc.nextInt();
		
		total = ko + en + math;
		average = (double)total / 3;
	
		System.out.println((ko >= 40) && (en >= 40) && (math >= 40) && (average >= 60) ? "축하합니다, 합격입니다!" : "불합격입니다.");
		sc.close();
	}
	
	public void practice4() {
		
	}
	
	public void practice5() {
		Client c = new Client("myId", "myPassword12");
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디: ");
		String ID = sc.nextLine();
		if (c.getClientID().equals(ID)) {
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			if (c.getClientPassword().equals(password)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
		
	}
	
	public void practice6() {
		//Client
	}
	
	public void practice7() {
		double height;
		double weight;
		final double BMI;
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요: ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요: ");
		weight = sc.nextDouble();
		BMI = weight / (height*2);
		System.out.println("BMI 지수: " + BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		} else if(BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		} else if(BMI >= 23 && BMI < 25) {
			System.out.println("과체중");
		} else if(BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		} else if(BMI >= 30) {
			System.out.println("고도비만");
		}
		
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String t = sc.next();
		
		if (t.equals("+")) {
			System.out.println(x + y);
		} else if (t.equals("-")) {
			System.out.println(x - y);
		} else if (t.equals("*")) {
			System.out.println(x * y);
		} else if (t.equals("/")) {
			System.out.println(x / y);
		} else if (t.equals("%")) {
			System.out.println(x % y);
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수: ");
		double m = sc.nextInt();
		System.out.print("기말고사 점수: ");
		double l = sc.nextInt();
		System.out.print("과제 점수: ");
		double h = sc.nextInt();
		System.out.print("출석 회수: ");
		double p = sc.nextInt();
		
		double mp = (m/100) * 20;
		double lp = (l/100) * 30;
		double hp = (h/100) * 30;
		double pp = (p/20) * 20;
		double total = mp + lp + hp + pp;
		
		if(p <= 14) {
			System.out.printf("[출석 회수 부족(%d/%d)]", (int)p, 20);
		} else {
			System.out.println("중간고사 점수(20): " + mp);
			System.out.println("기말고사 점수(30): " + lp);
			System.out.println("과제 점수(30): " + hp);
			System.out.println("중간고사 점수(20): " + pp);
			System.out.println("총점: " + total);
			if(total >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			
			}
		}
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 기능을 선택하세요.\n1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격");
		System.out.print("\n4. 계절\n5. 로그인\n6. 권한 확인");
		System.out.println("\n7. BMI\n8. 계산기\n9. P/F");
		System.out.print("선택: ");
		int num = sc.nextInt();
		System.out.printf("실습문제%d 실행\n", num);
		
		switch (num) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
			
			
		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i*j);
			}
			System.out.println("\n");
		}
		
		
	}
	
	public void practice11() { // password 중복검사
		
		String password = new Scanner(System.in).nextLine();
		char[] charArray = password.toCharArray();
		
		
		
		
		if (password.length() > 4) {
			System.out.println("자리수 안맞음");
		} else {
			int t = 0;
			outer : for (int i = 0; i < charArray.length; i++) {
				for (int j = 0; j < charArray.length; j++) {
					if (charArray[i] == charArray[j]) {
						t++;
					}
					if (t > 1) {
						System.out.println("중복");
						break outer;
					}
				}
				t = 0;
				if (i == 3) {
					System.out.println("생성 성공");
				}
			}
		}
		
	}
	
	public void practice11_1() {
		String str = new Scanner(System.in).nextLine();
		String[] strArray = str.split("");
		StringBuilder str1 = new StringBuilder();
		
		for(int i = 0; i < strArray.length; i++) {
			if (str1.indexOf(strArray[i])<0) {
				str1.append(strArray[i]);
			}
		}
		
		
		if (str.length() > 4) {
			System.out.println("자리 수 안 맞음");
		} else {
			if (str1.length() <4) {
				System.out.println("중복 값 있음");
			} else {
				System.out.println("생성 성공");
			}
			
		}
	}
	
	
	public void practice() {
		
		
	}
	
	
}

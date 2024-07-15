package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		//입력된 값이 1보다 작을 때 "1 이상의 숫자를 입력해주세요." 출력
		
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {//입력된 값이 1보다 크거나 같을 때
			//1부터 입력된 값까지 출력
			//ex) 4가 입력되었을 때 : 1 2 3 4

			for(int i = 1; i < num + 1; i++) {
				System.out.print(i);
				if(i != num) {
					System.out.print(" ");
				}
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		//입력된 값이 1보다 작을 때 "1 이상의 숫자를 입력해주세요." 출력
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			if (num < 1) {
				continue;
			} else {//입력된 값이 1보다 크거나 같을 때
				//1부터 입력된 값까지 출력
				//ex) 4가 입력되었을 때 : 1 2 3 4
	
				for(int i = 1; i < num + 1; i++) {
					System.out.print(i);
					if(i != num) {
						System.out.print(" ");
					}
				}
			}
			break;
		}
	}
	
	public String practice3() {
		
		String str = "";
		System.out.print("1 이상의 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num ; i > 0; i-- ) {
			System.out.print(i);
			str += i;
			if(i > 1) {
				System.out.print(" ");
			}
		}
		return str;
	}
	
	public void pratice3_1(LoopPractice l) {
		
		LoopPractice lp = new LoopPractice();
		System.out.print("1 이상의 숫자를 입력하세요: ");
		
		String str = lp.practice3();
		
		System.out.println(str);
		
		
	}
	
	

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			if (num < 1) {
				continue;
			} else {
				for (int i = num; i >= 1 ; i--) {
					System.out.print(i);
					if(i > 1) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}
	
	public void practice5() {
		int num = new Scanner(System.in).nextInt();
		int total = 0;
		
		for (int i = 1; i <= num; i++) {
			total += i;
			if (i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + total);
			}
		}
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자: ");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = new Scanner(System.in).nextInt();
			
		if(num1 <1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num2 > num1) {
				for(int i = num1; i <= num2; i++) {
					if(i < num2) {
						System.out.print(i+" ");
					} else {
						System.out.print(i);
					}
				}
			} else {
				for(int i = num2; i <= num1; i++) {
					if(i < num1) {
						System.out.print(i+" ");
					} else {
						System.out.print(i);
					}
				}
			}
		}
	}
	
	
	public void practice7() {
		
		while(true) {
			System.out.print("첫 번째 숫자: ");
			int num1 = new Scanner(System.in).nextInt();
			System.out.print("두 번째 숫자: ");
			int num2 = new Scanner(System.in).nextInt();
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else {
				if(num2 > num1) {
					for(int i = num1; i <= num2; i++) {
						if(i < num2) {
							System.out.print(i+" ");
						} else {
							System.out.print(i);
						}
					}
				} else {
					for(int i = num2; i <= num1; i++) {
						if(i < num1) {
							System.out.print(i+" ");
						} else {
							System.out.print(i);
						}
					}
				}
				break;
			}
			
		}
	}
	
	
	public void practice8() {
		System.out.print("숫자: ");
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	
	public void practice9() {
		System.out.print("숫자: ");
		int num = new Scanner(System.in).nextInt();
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println("====" + i + "단 ====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
			}
		}
	}
		
	public void practice10() {
		while(true) {
			System.out.print("숫자: ");
			int num = new Scanner(System.in).nextInt();
			
			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.println("====" + i + "단 ====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i*j);
					}
				}
			}
			break;
		}
	}
	
	public void practice11() {
		
		System.out.print("시작 숫자: ");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("공차: ");
		int num2 = new Scanner(System.in).nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) continue;
			else {
				if(i != 9) {
					System.out.print(num1 +" ");
					num1 += num2;
				} else {
					num1 += num2;
					System.out.print(num1);
				}
				
			}
			
		}
		
	}
	
	public void practice12() {
		
		
		while (true) {
			String str = new Scanner(System.in).nextLine();
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			int num1 = new Scanner(System.in).nextInt();
			int num2 = new Scanner(System.in).nextInt();
			
			if (str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			} else if ("+-*/%".indexOf(str) == -1) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			} else {
				if (str == "+") {
					System.out.printf("%d + %d = %d", num1, num2, num1+num2); break;
				} else if (str.equals("-")) {
					System.out.printf("%d - %d = %d", num1, num2, num1-num2); break;
				} else if (str.equals("*")) {
					System.out.printf("%d * %d = %d", num1, num2, num1*num2); break;
				} else if (str.equals("/")) {
					System.out.printf("%d / %d = %d", num1, num2, num1/num2); break;
				} else if (str.equals("%")) {
					System.out.printf("%d %% %d = %d", num1, num2, num1%num2); break;
				}
			}
		}
		
	}


	public void practice12_1() {
		
		
		while (true) {
			String str = new Scanner(System.in).nextLine();
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			int num1 = new Scanner(System.in).nextInt();
			int num2 = new Scanner(System.in).nextInt();
			
			switch(str) {
			case "+" :
				System.out.printf("%d %s %d = %d\n", num1, str, num2, num1 + num2); break;
			case "-" :
				System.out.printf("%d %s %d = %d\n", num1, str, num2, num1 - num2); break;
			case "*" :
				System.out.printf("%d %s %d = %d\n", num1, str, num2, num1 * num2); break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", num1, str, num2, num1 / num2); break;
				}
			case "%" :
				System.out.printf("%d %s %d = %d\n", num1, str, num2, num1 % num2); break;
			default : 
				System.out.println("없는 연산자입니다. 다시 입력해주세요."); break;
			}
		}
		
	}

	public void practice13() {
		System.out.print("정수 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		for (int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice14() {
		System.out.print("정수 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		for (int i = 0; i < num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}	

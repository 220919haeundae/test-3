package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimentionPractice {

	public void practice1() {
		String[][] arr = new String[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) { //행의 길이
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j +")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] numbers = new int[4][4];
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++) { // 행의 인덱스
			for(int j = 0; j < numbers[i].length; j++) { //열의 인덱스
				numbers[i][j] = ++count; // 4*i + (j +1)
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		int count = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice4() { //***
		int[][] arr = new int[4][4];
		int sumx = 0;
		int sumy = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10 +1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				sumx += arr[i][j];
			}
			arr[i][3] = sumx;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				sumy += arr[j][i];
			}
			arr[3][i] = sumy;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice4_1() {
		int[][] sumArr = new int[4][4];
		
		//0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장
		//3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로세로 합
		
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr[i].length; j++) {
				
				int lastRow = sumArr.length - 1; //3 
				int lastCol = sumArr[i].length -1; //3
				
				//랜덤값을 각 위치에 저장
				if (i != lastRow && j != lastCol) {
					sumArr[i][j] = (int)(Math.random()*10 +1);
				}
				
				
				
				//마지막 행의 위치에 현재 값을 더하기
				if(i < lastRow) {
					sumArr[lastRow][j] += sumArr[i][j];
				}
				
				if (j < lastCol) {
					sumArr[i][lastCol] += sumArr[i][j];
				}
			}
			System.out.println(sumArr[3][3]);

			
		}
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr[i].length; j++) {
				System.out.printf("%5d", sumArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
		boolean isExit = true;
		
		int row = 0;
		int col = 0;
		
		while(isExit) {
			Scanner sc = new Scanner(System.in);
			System.out.print("행 크기: ");
			row = sc.nextInt();
			System.out.print("열 크기: ");
			col = sc.nextInt();
			
			if (row >= 1 && col <= 10) {
				if (row >= 1 && col <= 10) {
					isExit = false;
				} else {
					System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
					continue;
				}
			} else {
				System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
		}
		
		
		char[][] arr = new char[row][col];
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = (char)(int)(Math.random()*25 + 65);
			}
		}
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%-2c", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice6() {
		
		String[][] str = {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, 
				{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, 
				{"열", "히", "!", "더", "!!"}};
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.printf("%2s", str[j][i]);
			}
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기: ");
		int row = sc.nextInt();
		char[][] rowCol = new char[row][];
		char a = "a".charAt(0);
		
		for(int i = 0; i < rowCol.length; i++) {
			System.out.printf("%d행의 열 크기: ", i);
			int col = sc.nextInt();
			rowCol[i] = new char[col];
			for(int j = 0; j < rowCol[i].length; j++) {
				rowCol[i][j] = a;
				a++;
			}
		}
		
		for(int i = 0; i < rowCol.length; i++) {
			for(int j = 0; j <rowCol[i].length; j++) {
				System.out.printf("%-2c", rowCol[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice8() {
		String[] strArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] first = new String[3][2];
		String[][] second = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < first[i].length; j++) {
				first[i][j] = strArr[count++];
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < second.length; i++) {
			for(int j = 0; j < second[i].length; j++) {
				second[i][j] = strArr[count++];
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		
		}
		
	}
	
	public void practice9() {

		String[] strArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] first = new String[3][2];
		String[][] second = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < first[i].length; j++) {
				first[i][j] = strArr[count++];
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < second.length; i++) {
			for(int j = 0; j < second[i].length; j++) {
				second[i][j] = strArr[count++];
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println();
		
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < first[i].length; j++) {
				if(first[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %s번째 줄 %s쪽에 있습니다.", name, i+1 == 1 ? "첫" : i+1 == 2 ? "두" : "세", j == 1 ? "오른" : "왼");
				};
			}
		}
		
		for(int i = 0; i < second.length; i++) {
			for(int j = 0; j < second[i].length; j++) {
				if(second[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %s번째 줄 %s쪽에 있습니다.", name, i+1 == 1 ? "첫" : i+1 == 2 ? "두" : "세" , j == 1 ? "오른" : "왼");
				};
			}
		
		}
	}
	
	
	
	
}

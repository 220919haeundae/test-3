package com.kh.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

//	public void practice1() {
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			//인덱스 시작번호
//			arr[i] = i+1;
//			System.out.print(arr[i]);
//			if (i < arr.length-1) {
//				System.out.print(" ");
//			} else {
//				System.out.print("\n");
//			}
//		}
//		for(int i=0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i < arr.length-1) {
//				System.out.print(" ");
//			}
//		}
//	
//	}
	
	
//	public void practice2() {
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[arr.length-1-i] = i+1;
//		}
//		
//		for (int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//			if (i != arr.length-1) {
//				System.out.print(" ");
//			} else {
//				System.out.print("\n");
//			}
//		}
//	}
	
//	public void practice3() {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for (int i=0; i< arr.length; i++) {
//			arr[i] = i+1;
//		}
//		for (int i=0; i< arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i != arr.length-1) {
//				System.out.print(" ");
//			} else {
//				System.out.print("\n");
//			}
//		}
//		
//	}
	
//	public void practice4() {
//		String[] strArr = new String[5];
//		
//		strArr[0] = "사과";
//		strArr[1] = "귤";
//		strArr[2] = "포도";
//		strArr[3] = "복숭아";
//		strArr[4] = "참외";
//		
//		System.out.print(strArr[1]);
//	}
	
//	public void practice5() {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		char ch = sc.nextLine().charAt(0);
//		char[] chArr = new char[str.length()];
//		int sum = 0;
//		
//		for(int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//		}
//		
//		System.out.printf("%s에 %c가 존재하는 위치: ", str, ch);
//		for(int i = 0; i < chArr.length; i++) {
//			if(chArr[i] == ch) {
//				System.out.print(i);
//				if(chArr.length != (str.length()-1)) {
//					System.out.print(" ");
//				}
//				sum += 1;
//			}
//		}
//		System.out.println();
//		System.out.printf("%c의 개수: %d", ch, sum);
//		
//		
//	}
	
//	public void practice6() {
//		Scanner sc = new Scanner(System.in);
//		String[] day_Of_Week = {"월", "화", "수", "목", "금", "토", "일"};
//		int num = sc.nextInt();
//		
//		if((num < day_Of_Week.length) && num >= 0) {
//			System.out.print(day_Of_Week[num]);
//		} else {
//			System.out.print("잘못 입력하셨습니다.");
//		}
//		
//	}
	
//	public void practice7() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수: ");
//		int len = sc.nextInt();
//		int[] arr = new int[len];
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
//				arr[i] = sc.nextInt();
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			sum += arr[i];
//			if(i != arr.length-1) {
//				System.out.print(" ");
//			} else {
//				System.out.print("\n 총 합: " + sum);
//			}
//		}
//		
//	}
	
//	public void practice8() {
//		Scanner sc = new Scanner(System.in);
//		int odd;
//		
//		while(true) {
//			System.out.print("정수: ");
//			odd = sc.nextInt();
//			if(odd >= 3 && odd%2 == 1) {
//				break;
//			} else {
//				System.out.println("다시 입력하세요");
//			}
//		}
//		
//
//		int[] arr = new int[odd];
//		int value = 1;
//		for(int i = 0; i < arr.length ; i++) {
//			if (i < odd/2) {
//				arr[i] = value++;
//			} else {
//				arr[i] = value--;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i != arr.length-1) {
//				System.out.print(", ");
//			}
//		}
//	}

//	public void practice9() { // ***
//		Scanner sc = new Scanner(System.in);
//		String[] strArr = {"양념", "간장", "마늘", "슈프림"};
//		String str = sc.nextLine();
//		
//		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i].equals(str)) {
//				System.out.println(strArr[i] + "치킨 배달 가능");
//				break;
//			} else {
//				if(i == strArr.length-1) {
//					System.out.println(str+"치킨은 없는 메뉴입니다.");
//				} else {
//					continue;
//				}
//			}
//		}
//	}
	
//	public void practice10() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주민등록번호(-포함) : ");
//		String p = sc.nextLine();
//		String[] pArray = p.split("");
//		
//		String[] cloneArray = pArray.clone();
//		for(int i = 8; i < cloneArray.length; i++) {
//			cloneArray[i] = "*";
//		}
//		String p1 = "";
//		for(int i = 0; i < cloneArray.length; i++) {
//			p1 += cloneArray[i];
//		}
//		System.out.println(p1);
//	}
	
//	public void practice10_1() {
//		Scanner sc = new Scanner(System.in);
//		String ssn = sc.nextLine();
//		
//		
//		char[] origin = new char[ssn.length()];
//		
//		for(int i = 0; i < origin.length; i++) {
//			origin[i] = ssn.charAt(i);
//		}
//		
//		char[] copy = new char[origin.length];
//		for(int i=0; i<copy.length; i++) {
//		
//	}
	
	
//	public void practice11() {
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i != arr.length-1) {
//				System.out.print(" ");
//			}
//		}
//		
//	}
	
//	public void practice12() {
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i != arr.length-1) {
//				System.out.print(" ");
//			} else {
//				System.out.println();
//			}
//		}
//		
//		int max_Num = arr[0];
//		int min_Num = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			max_Num = Math.max(arr[i], max_Num);
//			min_Num = Math.min(arr[i], min_Num);
//		}
//		
//		System.out.println("최대값: " + max_Num);
//		System.out.print("최소값: " + min_Num);
//	}
	
//	public void practice13() {
//		// 길이가 10인 정수형 배열을 선언 및 할당
//		int[] numbers = new int[10];
//		
//		for(int i = 0; i < numbers.length; i++) {
//			// 1~10Rkwl 랜덤값 저장
//			numbers[i] = (int)(Math.random()*10 +1);
//			
//			
//			// i-1(현재 위치의 직전 위치) 중복값이 있는지 확인
//			for(int j = 0; j < i; j++) {
//				//i번째 위치의 값과 j번쨰 위치의 값을 비교
//				//같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 수 있도록
//				if(numbers[i] == numbers[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		
//		
//	}
	
//	public void practice14() {
//		
//		int[] arr = new int[6];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*60 + 1);
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					--i;
//					break;
//				}
//			}
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//	}
	
//	
//	
//	public void practice15() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열: \n");
//		String str = sc.nextLine();
//		String[] strArr = str.split("");
//		int count = 0;
//		
//		for (int i = 0; i < strArr.length ; i++) {
//			for (int j = i+1; j < strArr.length ; j++) {
//				if(strArr[i].equals(strArr[j])) {
//					count += 1;
//				}
//			}
//		
//		}
//		
//		String[] strArr1 = new String[strArr.length - count];
//		count = 0;
//		
//		for (int i = 0; i < strArr.length ; i++) {
//			for (int j = i+1; j < strArr.length ; j++) {
//				if(strArr[i].equals(strArr[j])) {
//					continue;
//				} else {
//					strArr1[count] = strArr[i];
//				}
//			}
//		}
//		
//		System.out.print("문자열에 있는 문자: ");
//		for(int i = 0; i < strArr1.length; i++) {
//			System.out.print(strArr[i]);
//		}
//		System.out.print("\n문자 개수: " + strArr1.length);
//		
//	}
	
//	public void practice16() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 크기를 입력하세요: ");
//		int len = sc.nextInt();
//		sc.nextLine();
//		String[] strArr = new String[len];
//		
//		for(int i = 0; i < strArr.length; i++) {
//			strArr[i] = sc.nextLine();
//		}
//		while(true) {
//		
//			System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
//			String answer = sc.nextLine();
//			if(answer.equals("Y") || answer.equals("y")) {
//				System.out.print("더 입력하고싶은 개수: ");
//				int len1 = sc.nextInt();
//				sc.nextLine();
//				len += len1; 
//				String[] strArr1 = new String[len];
//				System.arraycopy(strArr, 0, strArr1, 0, strArr.length);
//				strArr = strArr1;
//				for(int i = len - len1 ; i < len; i++) {
//					strArr[i] = sc.nextLine();
//				}
//			} else {
//				System.out.print("[");
//				for(int i = 0; i < strArr.length; i++) {
//					System.out.print(strArr[i]);
//					if (i != strArr.length -1) {
//						 System.out.print(", ");
//					}
//					
//				}
//				System.out.print("]");
//				break;
//			}
//		}
//	}
	
}

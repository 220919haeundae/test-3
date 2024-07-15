package codeup_practice.practice1;

import java.util.Scanner;

public class Practice_1535 {
	Scanner sc = new Scanner(System.in);
	int num;
	int[] arr;
	
	
	public Practice_1535() {
		System.out.print("배열의 크기를 지정하세요: ");
		num = sc.nextInt();
	}
	
	
	public int[] getArr() {
		return arr;
	}
	
	
	public void setArr() {
		arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = (int)(Math.random()*10 +1);
		}
	}
	
	
	
	
	
}

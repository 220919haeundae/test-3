package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

	private int[] lotto;
	
	public Lotto(int n) {
		this.lotto = new int[n];
		for(int i = 0; i < n; i++) {
			lotto[i] = (int)(Math.random()*45 +1);
		}
	}
	
	public void information() {
		for(int i=0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public void information1_1() {
		System.out.printf("고른 번호: %s", Arrays.toString(lotto));
	}
	
}

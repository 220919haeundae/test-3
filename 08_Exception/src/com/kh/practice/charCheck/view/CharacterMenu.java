package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	public CharacterMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		CharacterController cc = new CharacterController();
		
		String str = sc.nextLine();
		
		try {
			System.out.printf("'%s'에 포함된 영문자 개수 : %d", str, cc.count(str));
			
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
		
			
		
	}
	
	

	
}

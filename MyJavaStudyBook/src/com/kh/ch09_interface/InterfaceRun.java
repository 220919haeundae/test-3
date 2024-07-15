package com.kh.ch09_interface;

public class InterfaceRun {
	/*
	 *  * 인터페이스 = 상수필드 + 추상메소드
	 *   - 추상메소드를 가지고 있기 때문에 객체를 직접 생성할 수 없음
	 *   - 참조변수 타입으로 사용 가능
	 *   
	 *   - 추상메소드 : 미완성된 메소드
	 *   			몸통부({})가 없는 메소드 ( 구현되지 않음)
	 *   			오버라이딩 후에 메소드 호출이 가능
	 *   
	 *   public abstract 반환타입 메소드명([매개변수]);
	 */
	
	
	public static void main(String[] args) {
		Plant monstera = new Monstera("카스테라");
		Plant lavender = new Lavender("소고기");
		
		
		System.out.println(monstera);
		System.out.println(lavender);
		
		System.out.println("----------- 1회 -----------------");
		
		monstera.sprinkleWater();
		monstera.baskSun();
		
		lavender.sprinkleWater();
		lavender.baskSun();
		
		System.out.println(monstera);
		System.out.println(lavender);
		
		lavender.sprinkleWater();
		lavender.baskSun();
		
		System.out.println("----------- 2회 -----------------");
		
		System.out.println(monstera);
		System.out.println(lavender);
		
		
		
	}

}

package com.kh.practice;

public class Task2 implements Runnable {
	// 이 Thread에서 실행시킬 작업을 run() 메소드에 저장
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + "Task2");
		
	}
	
	

}

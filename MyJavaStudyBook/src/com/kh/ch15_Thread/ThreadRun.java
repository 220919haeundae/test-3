package com.kh.ch15_Thread;

public class ThreadRun {

	public static void main(String[] args) {
		/*
		 * * 스레드(Thread) : 프로그램 내에서 실행 흐름을 가지고 있는 최소 단위
		 * 					main 메소드 실행 시 메인 스레드가 실행되는 것임
		 * 	- 프로세스 : 실행중인 프로그램
		 *  * 싱글 스레드 : 한 프로세스 내에서 한 개의 스레드가 실행되는 것
		 *  * 멀티 스레드 : 한 프로세스 내에서 여러 개의 스레드가 실행되는 것
		 * 
		 */
		
		
		Thread thread1 = new Thread1();
		Runnable task = new Thread2();
		Thread thread2 = new Thread(task);
		
		// 스레드들을 실행대기 상태로 변경
		thread1.start();
		thread2.start();
		
		
		
	}

}

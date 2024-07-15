package com.kh.ch15_Thread;

import java.util.Date;

/*
 * 스레드 정의 방법 2. Runnable 인터페이스 구현
 */
public class Thread2 implements Runnable {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i =0; i < 10; i++) {
			try {
				System.out.println(name + " : " + new Date().getTime());
				Thread.sleep(3*1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(name + ": ----- END -----");
	}
}

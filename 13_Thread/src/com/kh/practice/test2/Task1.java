package com.kh.practice.test2;

public class Task1 extends Thread {

	@Override
	public void run() {
		// 1~30까지 짝수만 출력
		setName("Task1");
		for(int i = 1 ; i <= 30; i ++) {
			if(i%2 == 0) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
			}
		}
	}
}

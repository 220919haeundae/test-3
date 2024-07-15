package com.kh.practice.test2;

public class ThreadRun {

	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		ThreadGroup tg = new ThreadGroup("Group1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		t1.start();
		t2.start();

		try {t1.join(); t2.join();} catch (InterruptedException e) {};
		System.out.println(tg.getName() + " : " + tg.activeGroupCount());
		System.out.println(Thread.activeCount());
		System.out.println("====" + Thread.currentThread().getName() + "====");
	}
}

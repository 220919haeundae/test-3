package com.kh.practice;

public class Task1 implements Runnable {

	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + "Task1");
		
	}
	
}

package com.kh.practice;

public class ThreadRun {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		System.out.println(name + ":" + "main Thread");
		t1.start();
		t2.start();
		
		System.out.println("====" + name + "====");

	}

}

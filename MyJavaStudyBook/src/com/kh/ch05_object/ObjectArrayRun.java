package com.kh.ch05_object;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Product[] p = new Product[3];
		p[0] = new Product("그램");
		p[1] = new Product("맥북");
		p[2] = new Product("데스크탑");
		
		
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName());
		}
	}
}

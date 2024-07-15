package com.kh.hw.empoyee.controller;

public class Run {

	public static void main(String[] args) {

		Man m = new Man("ddfdf", '남');
		
		m.info();
		
		Person p = m;
		p.info();
		Person p1 = new Person();
		p1.info();
		
	}

}

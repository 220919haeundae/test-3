package com.kh.practice.list;

import java.util.HashSet;
import java.util.Set;

public class TestRun {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new TestChild();
		Test t3 = new Test();
		
		t1.hashCode();
		t2.hashCode();
		t1.equals(t2);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1.equals(t2));
		
		
		Test t = new Test();
		TestChild tc = new TestChild();
		
		Set<Test> s = new HashSet<>();
		System.out.println("-----------------------------------");
		System.out.println(System.identityHashCode(t));
		System.out.println(System.identityHashCode(tc));
		System.out.println(System.identityHashCode(t3));
		System.out.println("-----------------------------------");
		
		
		s.add(t);
		s.add(tc);
		
		for(Test t12  : s) {
			System.out.println(t.age + t.age);
		}
	}
	
	

}

package com.kh.practice.list;

public class Test {
	String name = "홍길동";
	int age = 28;
	
	
	@Override
	public int hashCode() {
//		System.out.println(name.hashCode() + age);
		return name.hashCode() + age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Test) {
			Test t = (Test)obj;
			return (name.equals(t.name)) && (age == t.age);
		} else return false;
	}
	

}

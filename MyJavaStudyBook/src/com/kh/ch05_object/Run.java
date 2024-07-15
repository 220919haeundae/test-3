package com.kh.ch05_object;

public class Run {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		animal1.setName("도치");
		animal1.setType("고슴도치");
		animal1.setGender('M');
		animal1.setMasterName("주원님");
		animal1.setAge(2);
		System.out.println(animal1);
		
	}

}

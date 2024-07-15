package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.information();
		
		Student s1 = new Student(7, 5, "이요셉", 164, '남');
		
		s1.information();
		
		Student s2 = new Student();
		s2.information();
	}

}

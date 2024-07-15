package com.kh.practice.student.controller;

import java.util.Scanner;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		for (int i = 0; i < sArr.length; i++) {
		 
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			System.out.print("과목을 입력하세요: ");
			String subject = sc.next();
			System.out.print("점수를 입력하세요: ");
			int score = sc.nextInt();
			sArr[i] = new Student();
			sArr[i].setName(name);
			sArr[i].setSubject(subject);
			sArr[i].setScore(score);
		}
		
	}
	
	public Student[] printStudent() {
		return sArr;
		
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] sumAvg = new double[2];
		sumAvg[0] = sumScore();
		sumAvg[1] = sumScore()/5;
		return sumAvg;
	}

}

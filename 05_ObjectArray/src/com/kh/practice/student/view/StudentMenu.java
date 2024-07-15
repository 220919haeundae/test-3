package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController sc = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 =============");
		Student[] sArr = sc.printStudent();
		for(Student s : sArr) {
			System.out.println(s.inform());
		}
		System.out.println("========== 학생 성적 출력 =============");
		System.out.println("학생 점수 합계" + (int)sc.avgScore()[0]);
		System.out.println("학생 점수 평균" + sc.avgScore()[1]);
		System.out.println("========== 학생 결과 출력 =============");
		
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다.");
				
			} else {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}
		}

	}

}
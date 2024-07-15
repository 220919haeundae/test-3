package com.kh.hw.empoyee.controller;

import com.kh.hw.empoyee.model.vo.Employee;

public class EmployeeController {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	public int i;
	
	
	private Employee[] eArr = new Employee[10];
	
	public void add(int empNo, String name, char gender, String phone) {
		if(eArr[i] == null) {
			eArr[i] = new Employee(empNo, name, gender, phone);
		} else {
			System.out.println("이미 사용중인 사원 번호입니다.");
		}
	}
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		eArr[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		System.out.print("사원 번호를 입력하세요: ");
		i = sc.nextInt() - 1 ;
		eArr[i].setPhone(phone);
	}
	
	public void modify(int salary) {
		System.out.print("사원 번호를 입력하세요: ");
		i = sc.nextInt() - 1;
		eArr[i].setSalary(salary);
	}
	
	public void modify(double bonus) {
		System.out.print("사원 번호를 입력하세요: ");
		i = sc.nextInt() - 1;
		eArr[i].setBonus(bonus);
	}
	
	public Employee remove() {
		System.out.print("삭제할 사원 번호를 입력하세요: ");
		i = sc.nextInt() - 1;
		System.out.print("정말 삭제하시겠습니까? (y/n): ");
		char answer = sc.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
			return eArr[i] = null;
		} else {
			return eArr[i];
		}
		
	}
	
	public void inform() {
		for(int i = 0; i < eArr.length; i++) {
			if(eArr[i] != null) {
				System.out.println(eArr[i].printEmployee());
			} else {
				System.out.println("미사용 사원번호:" + (i + 1));
			}
		}
	}

}

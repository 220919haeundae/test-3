package com.kh.hw.empoyee.view;

import java.util.Scanner;

import com.kh.hw.empoyee.controller.EmployeeController;

public class EmployeeMenu {
	
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	int i;
	
	public EmployeeMenu() {
		
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요: ");
			int mNum = sc.nextInt();
			switch (mNum) {
			case 1: 
				insertEmp();
				break;
			case 2: 
				updateEmp();
				break;
			case 3: 
				deleteEmp();
				break;
			case 4: 
				printEmp();
				break;
			case 9: 
				System.out.print("프로그램을 종료합니다.");
				return;
			default: 
				System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	
	public void insertEmp() {
		System.out.print("사원 번호: ");
		int empNo = sc.nextInt();
		ec.i = empNo;
		System.out.print("사원 이름: ");
		String empName = sc.next();
		System.out.print("사원 성별: ");
		char gender = sc.next().charAt(0);
		System.out.print("전화 번호: ");
		String phone = sc.next();
		ec.add(empNo, empName, gender, phone);
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n): ");
		char answer = sc.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("사원 부서: ");
			String dept = sc.next();
			System.out.print("사원 연봉: ");
			int salary = sc.nextInt();
			System.out.print("보너스 율: ");
			double bonus = sc.nextDouble();
			ec.add(empNo, empName, gender, phone, dept, salary, bonus);
		}
		
	}
	public void updateEmp() {
		System.out.println("가장 최신의 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.print("1. 전화번호\n2. 사원 연봉\n3. 보너스 율\n9. 돌아가기\n");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.print("수정할 전화번호: ");
			String phone = sc.next();
			ec.modify(phone);
		} else if(num == 2) {
			System.out.print("수정할 사원 연봉: ");
			int salary = sc.nextInt();
			ec.modify(salary);
		} else if (num == 3) {
			System.out.print("수정할 보너스 율: ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
		}
		
	}
	public void deleteEmp() {
		ec.remove();
	}
	public void printEmp() {
		ec.inform();
	}
	
	
	
	

}

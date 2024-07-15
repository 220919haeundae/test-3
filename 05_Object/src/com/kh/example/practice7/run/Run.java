package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setAddress("KH");
		e.setAge(28);
		e.setBonusPoint(50);
		e.setDept("l반");
		e.setEmpName("이요셉");
		e.setEmpNo(3);
		e.setGender('남');
		e.setJob("Student");
		e.setPhone("0460");
		e.setSalary(50000);
		
		System.out.println(e.getAddress());
		System.out.println(e.getAge());
		System.out.println(e.getBonusPoint());
		System.out.println(e.getDept());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpNo());
		System.out.println(e.getGender());
		System.out.println(e.getJob());
		System.out.println(e.getPhone());
		System.out.println(e.getSalary());
	}

}

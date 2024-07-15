package com.kh.practice.chap01;

import java.util.Scanner;

public class Client {

	private String clientID;
	private String clientPassword;
	String grade = "user";
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Client(String ID, String password) {
		this.clientID = ID;
		this.clientPassword = password;
		
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getClientPassword() {
		return clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}
	
	public void practice6() {
		System.out.println("이 회원의 권한");
		if(this.getGrade().equals("admin")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		} else if(this.getGrade().equals("user")) {
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
		} else {
			System.out.println("게시글 조회");
		}
	}
	
}

package com.kh.model.vo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1196985339991386362L;
	
	private String nickName;
	private int score = 0;
	
	public User(String name) {
		this.nickName = name;
	}
	
	public User() {}
	
	public String toString() {
		return "이름 : " + nickName + ", 점수 : " + score;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}

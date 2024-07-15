package com.kh.practice.list;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	List<String> list = new ArrayList<>();
	
	public void enQueue(String data) {
		list.add(data);
	}
	
	public String deQueue() {
		if(list.isEmpty()) {
			return "꺼내올 데이터가 없습니다.";
		}
		return list.remove(0);
	}

}

package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b = new Book();
		Book b1 = new Book("모모", "한빛", "미하엘 앤데");
		Book b2 = new Book("모모", "한빛", "미하엘 앤데", 15000, 10);
		
		b.information();
		b1.information();
		b2.information();
	}
	


}

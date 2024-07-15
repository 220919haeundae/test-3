package com.kh.practice.list.library.model.vo;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.getTitle().charAt(0) - b2.getTitle().charAt(0);
	}
	
	

}

package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.library.model.vo.BookComparator;

public class BookController {
	List<Book> list = new ArrayList<>();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 20000));
		list.add(new Book("대화의 기술", "강보람", "인문", 20000));
		list.add(new Book("암 정복기", "박신우", "의료0", 20000));
	}
	
	public void insertBook(Book b) {
		list.add(b);
	}
	
	public ArrayList<Book> selectList() {
		
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> bookList = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				bookList.add(b);
			}
		}
		
		return bookList;
	}
	
	public Book deleteBook(String title, String author) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public int ascbook() {
		list.sort(new BookComparator());
		return 1;
	}

}

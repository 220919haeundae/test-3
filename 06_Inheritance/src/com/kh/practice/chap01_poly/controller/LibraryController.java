package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = new Member();
	
	private Book[] bList = new Book[5]; 
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문짝", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	
	
	public void insertMember(Member mem) {
		
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i+"번 도서 : " + bList[i].toString());
		}
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		for(int i = 0; i < bList.length; i++) {
			boolean key = bList[i].getTitle().contains(keyword);
			if(key == true) {
				System.out.println(i+"번 도서 : " + bList[i].toString());
			} else {
				
			}
		}
		return bList;
	}
	
	public int rentBook(int Index) {
		int result = 0;
		if(bList[Index] instanceof AniBook) {
			AniBook a = (AniBook)bList[Index];
			if(a.getAccessAge() > mem.getAge()) {
				result = 1;
			}
		} else if (bList[Index] instanceof CookBook) {
			CookBook c = (CookBook)bList[Index];
			if(c.isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}
	
	

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Book[] getbList() {
		return bList;
	}

	public void setbList(Book[] bList) {
		this.bList = bList;
	}
	
	

}

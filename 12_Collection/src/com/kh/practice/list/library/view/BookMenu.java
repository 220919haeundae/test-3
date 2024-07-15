package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("== Welcome KH Library==");
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 검색");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1 :
				insertBook();
				break;
			case 2 : 
				selectList();
				break;
			case 3 : 
				searchBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 : 
				ascBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	
	public void insertBook() {
		System.out.println("===== 새 도서추가 =====");
		
		System.out.print("1. 도서명 입력 받기");
		String title = sc.nextLine();
		System.out.print("2. 저자명 입력 받기");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타)");
		String category;
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			category = "인문";
			break;
		case 2 :
			category = "과학";
			break;
		case 3 :
			category = "외국어";
			break;
		default :
			category = "기타";
			break;
		}
		System.out.print("4. 가격 입력받기");
		int price = sc.nextInt();
		System.out.println("5. 매개변수 생성자를 이용하여 Book객체 생성");
		Book b = new Book(title, author, category, price);
		System.out.println("6. bc(BookController)의 insertBook으로 위의 Book객체 전달");
		bc.insertBook(b);
	}
	
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		System.out.println("1. bc 메소드 호출 후 -> 결과 값을 임의의 리스트에 대입");
		List<Book> bookList = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("도서 제목을 입력하세요 : ");
		String keyWord = sc.nextLine();
		List<Book> bList = bc.searchBook(keyWord);
		if(bList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b : bList) {
				System.out.println(b.toString());
				
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서명을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명을 입력하세요 : ");
		String author = sc.nextLine();
		Book b = bc.deleteBook(title, author);
		if(b != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}
	
	public void ascBook() {
		if(bc.ascbook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
	}
	
	
	

}

package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		File file = new File("./resources", "book.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			for(Book b : bArr) {
				if(b != null) {
					oos.writeObject(b);
				} else {
					break;
				}
			}
			oos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	public Book[] fileRead() {
		File file = new File("./resources", "book.txt");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			
			
			System.out.println("-----------------------------------------");
			try {
				while(true) {
					for(int i = 0; i < bArr.length; i++) {
//						if(bArr[i] == null) {
							bArr[i] = (Book) ois.readObject();
//							break;
//						}
					}
				}
			}catch(EOFException e) {}
			
			System.out.println("-----------------------------------------");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return bArr;
		
	}

}

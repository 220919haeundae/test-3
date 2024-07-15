package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO07_ObjectInputStream {

	public static void main(String[] args) {
		
		//파일 객체 선언
		File f = new File("./resources", "ObjectTest.txt");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(f)
							)
					);

			
			Student s;
			while((s = (Student)ois.readObject()) != null) {
				System.out.println(s);
			}
			ois.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				System.out.println("다 읽었습니다.");
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}

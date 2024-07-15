package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO02_BufferedOutputStream {

	public static void main(String[] args) {
		// 출력 파일 대상 객체
		File f = new File("./resources", "OutputTest.txt");
		
		// 파일 출력 스트림 객체
		
		
		try(FileOutputStream fos = new FileOutputStream(f);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			String contents = "2024-07-02 11:08 IO는 재밌어~";
				bos.write(contents.getBytes());
				bos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

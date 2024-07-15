package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO01_BufferedInputStream {

	public static void main(String[] args) {
		// 파일 객체 생성
		File file = new File("./resources", "src.txt");
		
		System.out.println("file check : " +  file.exists());
		
		// 파일 입력 스트림 선언
		FileInputStream fis = null; 	// 기반 스트림 -> 입출력 장치에 직접 연결
		BufferedInputStream bis = null; // 보조 스트림 -> 기반 스트림에 연결되어 보조하는 스트림
		
		byte[] buf = new byte[1024]; 	// 입력 데이터 저장 변수(버퍼)
		int len = -1;					// 입력 데이터 길이
		
		// 파일 입력 스트림 객체 생성
		try {
			fis = new FileInputStream(file); 	// File ----> FileInputStream
			bis = new BufferedInputStream(fis);	// FileInputStream ----> BufferedInputStream
			
			// 파일 입력 --> 파일로부터 데이터를 입력받기
			while((len = bis.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
				
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}

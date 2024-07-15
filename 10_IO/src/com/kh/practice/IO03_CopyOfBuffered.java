package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03_CopyOfBuffered {

	public static void main(String[] args) {
		//BufferedInputStream과 BufferedOutputStream을 이용하여
		//resources/src.txt ---> resources/dst.txt 복사
		
		//파일 객체
		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");
		
		
		//ToDo : 입출력 스트림 객체 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		// ToDo : 입출력 데이터 관련 변수 선언
		byte[] b = new byte[1024];
		int len = -1;
		int total = 0;
		
		
		try {
			//ToDo : 파일 입출력 스트림 생성
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(dst));
			//ToDo : 파일 입력 및출력 (파일 복사)
			while((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
				total += len;
			}
			bos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("복사 완료, 총 길이는 " + total);
		
		
		

	}

}

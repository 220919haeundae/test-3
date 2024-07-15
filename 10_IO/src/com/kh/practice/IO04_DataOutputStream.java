package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO04_DataOutputStream {

	public static void main(String[] args) {
		// 출력 파일 객체 생성
		File f = new File("./resources", "DataSample");
		//데이터 출력 스트림 선언
		DataOutputStream dos = null;
		// 스트림 생성
		try {
			
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(f)
							)
					);
			System.out.println();
			dos.write(83);
			dos.writeBoolean(true);
			dos.writeChar('J');
			dos.writeInt(369);
			dos.writeDouble(3.141592);
			
			dos.flush();
			
			
		} catch(FileNotFoundException e) {
			System.out.println("[ERROR] 파일을 찾을 수 없습니다. 오타를 확인하세요.");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("[ERROR] 입출력 오류 발생! .. 관리자 호출!!");
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch(IOException e) {
				System.out.println("[ERROR] 자원 반납 실패!");
				e.printStackTrace();
			}
			
		}
		
		
				
			
		

	}

}

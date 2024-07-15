package com.kh.ch12_IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamUtils {
	/*
	 * 보조 스트림 : 기반 스트림만으로는 부족한 성능을 향상시켜주는 스트림
	 * 			기반 스트림에서 제공되는 메소드 외에 추가적인 메소드 제공(데이터 전송 속도를 향상)
	 */
	// 출력 : 프로그램 -> 외부 매체(파일)
	public void objectSave(String filename, Object[] objects) {
		// FileOutputStream		: 파일에 연결하여 1바이트 단위로 출력할 수 있는 기반스트림
		//ObjectOutputStream	: 객체 단위로 출력할 수 있도록 도와주는 보조스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));) {
			
			for(Object obj : objects) {
				oos.writeObject(obj);
				oos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectRead(String filename) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));) {
			
			while(true) {
				System.out.println((ois.readObject()));
				// => 파일 데이터를 모두 읽은 경우 예외 발생, EOFEception
			}
		
		}catch(EOFException e) {
			System.out.println("읽기 완료");
		}catch(IOException e) {
			System.out.println("읽기 에러");
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
		}
	}
}

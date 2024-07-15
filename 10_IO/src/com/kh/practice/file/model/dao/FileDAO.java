package com.kh.practice.file.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File("./resources", file);
		return f.exists();
	}
	
	
	public void fileSave(String file, String s) {
		File f = new File("./resources", file);
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(f));
			bos.write(s.getBytes());
			bos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		File f = new File("./resources", file);
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(f));
			byte[] b = new byte[1024];
			int i = 0;
			while((i = bis.read(b)) != -1) {
				sb.append(new String(b, 0, i));
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		return sb;
	}
	
	/**
	 * 해당 파일에 추가할 내용을 기존 내용에 이어서 저장
	 * @param file 파일명
	 * @param s 추가할 내용
	 */
	
	public void fileEdit(String file, String s) {
		File f = new File("./resources", file);
		BufferedOutputStream bos = null;
		if(f.exists()) {
			try {
				bos = new BufferedOutputStream(new FileOutputStream(f, true));
				bos.write(s.getBytes());
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("없는 파일입니다.");
		}
		
		
	}

}

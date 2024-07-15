package com.kh.practice.phonebook.model.dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.phonebook.model.vo.PhoneBook;

public class PhoneDAO {
	PhoneBook[] pbArr;
	String[] infoArr;
	
	public PhoneDAO() {}
	
	public void create(int size) {
		pbArr = new PhoneBook[size];
	}
	
	public String[] read() {
		infoArr = new String[pbArr.length];
		for(int i = 0; i < infoArr.length; i++) {
			if(pbArr[i] != null) {
				infoArr[i] = pbArr[i].toString();
			}
		}
		return infoArr;
	}
	
	public void add(PhoneBook pb) {
		for(int i = 0; i < pbArr.length; i++) {
			if(pbArr[i] == null) {
				pbArr[i] = pb;
				break;
			}
		}
	}
	
	public void update(PhoneBook pb) {
		for(PhoneBook p : pbArr) {
			if(p == null) {
				p = pb;
				break;
			}
		}
		
	}
	
	public boolean delete(String name) {
		for(int i = 0; i < pbArr.length; i++) {
			if(pbArr[i].getName().equals(name)) {
				pbArr[i] = null;
				return true;
			}
		}
		return false;
		
		
	}
	
	public void save(String file) {
		File f = new File("./resources", file);
		try(ObjectOutputStream ois = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) {
			
			ois.writeObject(pbArr);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

}

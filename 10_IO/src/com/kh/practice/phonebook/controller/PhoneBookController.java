package com.kh.practice.phonebook.controller;

import com.kh.practice.phonebook.model.dao.PhoneDAO;
import com.kh.practice.phonebook.model.vo.PhoneBook;

public class PhoneBookController {
	PhoneDAO pd = new PhoneDAO();
	
	
	
	public void createPhoneBook(int size) {
		pd.create(size);
	}
	
	public String[] read() {
		return pd.read();
	}
	
	public void phoneBookUpdate(PhoneBook pb) {
		pd.update(pb);
	}
	
	public void addPhoneBook(PhoneBook pb) {
		pd.add(pb);
	}
	
	public void phoneBookDelete(String name) {
		pd.delete(name);
	}
	
	public void savePhoneBook(String file) {
		pd.save(file);
	}

}

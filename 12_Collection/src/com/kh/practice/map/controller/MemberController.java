package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private Map<String, Member> memberList = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(memberList.get(id) == null) {
			memberList.put(id, m);
			return true;
		}
		return false;
	}

	public String logIn(String id, String password) {
		Member m;
		if((m = memberList.get(id)) != null) {
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(memberList.containsKey(id)) {
			Member m = memberList.get(id);
			if(m.getPassword().equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			}
			
		}
		return false;
	}
	
	public boolean changeName(String id, String newName) {
		if(memberList.containsKey(id)) {
			Member m = memberList.get(id);
			m.setName(newName);
			return true;
		}
		return false;
	}
	
	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> memberMap = new TreeMap<>((s1, s2) -> s1.compareTo(s2));
		Set<String> keySet = memberList.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Member m = memberList.get(key);
			if(m.getName().equals(name)) {
				memberMap.put(key, m);
			}
		}
		return memberMap;
	} 
	
	public Map<String, Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(Map<String, Member> memberList) {
		this.memberList = memberList;
	}
	
	
	
	
}

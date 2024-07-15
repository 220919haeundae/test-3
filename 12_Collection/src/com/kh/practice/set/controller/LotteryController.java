package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	HashSet<Lottery> set = new HashSet<>();
	HashSet<Lottery> winSet = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		return set.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		if(winSet.remove(l)) {
			Iterator<Lottery> it = set.iterator();
			if(it.hasNext()) {
				winSet.add(it.next());
			}
		}
		return set.remove(l);
	}
	
	public HashSet<Lottery> winObject() {
		if(winSet.size() == 4) {
			return winSet;
		} else {
			int count = winSet.size();
			for(Lottery l : set) {
				winSet.add(l);
				count++;
				if(count==4) {
					break;
				}
			}
			return winSet;
		}
	}
	
	public TreeSet<Lottery> sortedObject() {
		TreeSet<Lottery> ts = new TreeSet<>(new SortedLottery()); 
		for(Lottery t : winSet) {
			ts.add(t);
		}
		return ts;
	}
	
	public boolean searchWinner(Lottery l) {
		Iterator<Lottery> it = winSet.iterator();
		while(it.hasNext()) {
			if(l.toString().equals(it.next().toString())) {
				return true;
			}
		}
		return false;
	}

	public HashSet<Lottery> getSet() {
		return set;
	}

	public void setSet(HashSet<Lottery> set) {
		this.set = set;
	}

	public HashSet<Lottery> getWinSet() {
		return winSet;
	}

	public void setWinSet(HashSet<Lottery> winSet) {
		this.winSet = winSet;
	}
	
	
	
	

}

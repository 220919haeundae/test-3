package com.kh.practice.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ListPractice {

	
	
	/*
	 *  * List 특징 *
	 *   : 중복이 가능하고, 순서가 있는 컬렉션
	 *   
	 *   * ArrayList
	 *    - 배열 구조
	 *    - 길이 제한이 없음
	 *    - 데이터 조회가 빠름
	 *    - 데이터 추가/삭제 느림
	 *    
	 *    
	 *    ArrayList<E> 참조변수명 = new ArrayList<>();
	 *    List<E> 참조변수명 = new ArrayList<>();
	 *    
	 *    * LinkedList
	 *     - 리스트 구조
	 *     - 데이터 추가/삭제가 빠르다.
	 *     - 데이터 조회가 느리다.
	 *     
	 *     LinkedList<E> 참조변수명 = new LinkedList<>();
	 *     List<E> 참조변수명 = new LinkedList<>();
	 *     
	 *  * List 관련 메소드
	 *   - 저장된 데이터 크기 : size();
	 *   - 데이터 추가 : add(data); / add(index, data);
	 *   - 데이터 삭제 : remove(index);, remove(Object obj);
	 *   - 데이터 조회 : get(index);
	 */
	
	public static void main(String[] args) {
//		ListPractice lp = new ListPractice();
//		lp.arrayListTest();
//		stackTest();
		queueTest();
		
		
		
	}
	
	public static void queueTest() {
		MyQueue mq = new MyQueue();
		mq.enQueue("28");
		mq.enQueue("이요셉");
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
	}
	
	public static void stackTest() {
		
		MyStack stack = new MyStack();
		
		stack.push("레몬");
		stack.push("아보카도");
		stack.push("파인애플");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

	public void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		// 데이터 추가 : add	//배열에서 추가했을 때는...
		list.add("아구찜");	//arr[0] = "아구찜";
		list.add("찜닭");		//arr[1] = "찜닭";
		list.add("갈비찜");	//arr[2} = "갈비찜";
		list.add(1, "김치찌개");
		
		// 데이터 조회 : get
		printList(list);
		
		System.out.println();
		// 데이터 삭제 : remove
		list.remove(0);
		list.remove("갈비찜");
		list.set(1, "돈까스");
		// 데이터 조회 : get
		printList(list);
		
		System.out.println();
		swapList(list, 0, 1);
		
		printList(list);
		
		List<String> list1 = list;
		
		linkedListTest();
		
		insertList(list, 1, list1);
		
		printList(list);
		
		
	}
	
	public <E> void swapList(List<E> list, int n1, int n2) {
		E temp = list.get(n1);
		list.set(n1, list.get(n2));
		list.set(n2, temp);
	}
	
	public static <E> void printList(List<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public <E> void insertList(List<E> list1, int n, List<E> list2) {
		
		for(int i = list2.size()-1; i >= 0; i--) {
			list1.add(n, list2.get(i));
		}
		
	}
	
	public static void linkedListTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int length = sc.nextInt();
		
		List<Integer> linkedList = new LinkedList<>();
		for(int i = 0; i < length; i++) {
			linkedList.add((int)(Math.random()*length + 1));
		}
		printList(linkedList);
	}
}

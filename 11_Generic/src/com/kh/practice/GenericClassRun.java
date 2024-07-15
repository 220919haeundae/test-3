package com.kh.practice;

//정수형 데이터를 다루는 클래스 : DataClass
/*
class DataClass {
	private int data;
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	} 
}
*/
/*
class DataClass {
	private double data;
	
	public double getData() {
		return data;
	}
	
	public void setData(double data) {
		this.data = data;
	} 
}
*/
/*
class DataClass {
	private Object data;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	} 
}
*/
class DataClass<T> {
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	} 
}


public class GenericClassRun {

	public static void main(String[] args) {
		DataClass<Double> d1 = new DataClass<>();
		d1.setData(1000d);
		System.out.println(d1.getData());
		DataClass<Integer> i1 = new DataClass<>();
		i1.setData(1000);
		System.out.println(i1.getData());
		DataClass<String> s1 = new DataClass<>();
		s1.setData("Apple");
		System.out.println(s1.getData());
		
		

	}

}

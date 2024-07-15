package com.kh.practice;

abstract interface Inter1<T> {
	public abstract void method1(T data);
}

abstract interface Inter2<F> {
	public abstract void Method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E> {
	@Override
	public void method1(E data) {
		System.out.println(data);
	}
	
	@Override
	public void Method2(E data) {
		System.out.println(data);
	}
}

public class GenericImpRun {

	public static void main(String[] args) {
		
		DataClass04<String> dc = new DataClass04<>();
		dc.method1("좋아하는 색은");
		dc.Method2("노란색이다.");
		
		DataClass04<Integer> d5 = new DataClass04<>();
		d5.method1(10000);
		d5.Method2(12121212);
		

	}

}

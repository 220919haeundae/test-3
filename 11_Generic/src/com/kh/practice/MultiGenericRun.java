package com.kh.practice;

//class DataClass03<L, R> {
//	private L left;
//	private R right;
//	
//	public void info() {
//		System.out.println(left);
//		System.out.println(right);
//	}
//	
//	
//	public L getLeft() {
//		return left;
//	}
//	public void setLeft(L left) {
//		this.left = left;
//	}
//	public R getRight() {
//		return right;
//	}
//	public void setRight(R right) {
//		this.right = right;
//	}
//}

class Box<T> {
	private T o;
	
	public T method1() {
		return o;
	}
	
	public void method2(T o) {
		this.o = o;
	}
	
	public <O extends Number> T method3() {
		return o;
	}
	
	public <O extends Number> void method4(T o) {
		this.o = o;
	}
	
	public static <O> O method5(O o) {
		return o;
	}
	
}






public class MultiGenericRun {

	public static void main(String[] args) {
		
		
	}
}

package com.kh.practice.chap02_abstractNInterface.run;

public class test {
	public static void main(String[] args) {
		
		twoSum(new int[]{1, 2, 3, 4}, 5);
		
		
	}
	
	
    public static int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second = 0;
    	
    	for(int i = 0; i < numbers.length; i++) {
    		for(int t = i+1; t < numbers.length; t++) {
    			if(target == numbers[i] + numbers[t]) {
    				return new int[] {first, second};
    			}
    		}
    	}
    	return new int[] {-1};
    }
}

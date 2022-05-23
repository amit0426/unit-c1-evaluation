package com.masai;

public class Difine {
	
//	Why String is immutable in java and what is the difference between String and String Builder? And Write some
//			of the methods of String class at least 5 with example.
	
	// 1.string is immutable - because of the security , caching and class loading ,synchronization
	// concurrency.
//	2. the reason of making string final is to destroy the immutability and to not allow others to extend it ;
	
	
	
	
//	difference between string and String builder
	
//	A string is immutable in java while a StringBuilder is mutable in java
	
	
	
//	example
	
	public static void main(String[] args) {
//	1.	
		char[] k = {'a','b','c'};
		String s = new String (k);
		
		System.out.println(s); // abc
		
//		2
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1);
		System.out.println(s2);
		

		
//		3
		
		byte[] arr = {1,3,5,6};
//		System.out.println(arr);
		String h  = new String (arr);
		System.out.println(h);
		
		
//		4.
		
		StringBuffer buff = new StringBuffer("amit");
		System.out.println(buff);
		
//		5.
		
		int l = "amit".length();
		
		System.out.println(l);
		
		
		
		
		
	}
	

 
	
	

}

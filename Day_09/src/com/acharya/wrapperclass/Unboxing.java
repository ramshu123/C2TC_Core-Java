package com.acharya.wrapperclass;

public class Unboxing {

	public static void main(String[] args) {
		Integer a = new Integer(10); 
		int j = a.intValue();//Older version of unboxing
		int i =a;
		System.out.println(a + " "+ j +" "+i);
	}

}
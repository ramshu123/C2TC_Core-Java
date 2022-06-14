package com.acharya.wrapperclass;

public class Autoboxing {

	public static void main(String[] args) {
		int a =10;
		
		Integer i = Integer.valueOf(a);//Older version of autoboxing
		
		Integer k = a;//Newer version of autoboxing
		System.out.println(a + " "+ i +" "+k);
		

	}

}

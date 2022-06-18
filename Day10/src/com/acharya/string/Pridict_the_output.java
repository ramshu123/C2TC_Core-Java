package com.acharya.string;

public class Pridict_the_output {

	public static void main(String[] args) {
		String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str == str1);
        System.out.println(str == str2);
    }
}
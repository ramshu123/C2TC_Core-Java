package com.acharya.thiskeywordcase2;
class Hello{
	Hello(){
		this(5);
		System.out.println("hello a");
	}
	Hello(int x){
		System.out.println(x);
	}
}

public class ConstructorCall1 {

	public static void main(String[] args) {
		Hello e = new Hello();

	}

}

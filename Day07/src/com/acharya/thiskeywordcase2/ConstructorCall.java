package com.acharya.thiskeywordcase2;
class Demo{
	Demo(){
		System.out.println("hello a");
	}
	Demo(int x){
		this();
		System.out.println(x);
	}
	Demo(float y){
		this();
		System.out.println(y);
	}
}

public class ConstructorCall {

	public static void main(String[] args) {
		Demo e = new Demo(5);

	}

}

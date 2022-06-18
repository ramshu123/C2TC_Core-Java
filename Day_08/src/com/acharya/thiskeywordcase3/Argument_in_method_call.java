package com.acharya.thiskeywordcase3;
class Demo{
	void m(Demo a){
		System.out.println("method is invoked");
	}
	void p(){
		m(this);
	}
}
public class Argument_in_method_call {

	public static void main(String[] args) {
		Demo s1 = new Demo();
		s1.p();
	}

}

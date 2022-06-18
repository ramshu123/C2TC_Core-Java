package com.acharya.thiskeywordcase3;
class Demo1{
	A4 obj;
	Demo1(A4 obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
}
class A4{
	int data=10;
	A4(){
		Demo1 b=new Demo1(this);
		b.display();
	}
}
	
public class Argument_in_constructor_call {

	public static void main(String[] args) {
		A4 a=new A4();

	}

}

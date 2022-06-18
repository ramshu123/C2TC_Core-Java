package com.acharya.statickeyword;

public class Java_static_block {
	int rollno;
	String name;
	static String college;
	static {
		college = "Acharya";
	}
	Java_static_block(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change() {
		college ="AIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	    }

	public static void main(String[] args) {
		Java_static_block s1 = new Java_static_block(111,"ramshad");
		Java_static_block s2 = new Java_static_block(222,"ajith"); 
		//change();
        s1.display();
        s2.display();

	}

}

package com.acharya.statickeyword;

public class Java_static_method {
	int rollno;
	String name;
	static String college = "ITS";
	Java_static_method(int r, String n)
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
		Java_static_method s1 = new Java_static_method(111,"ramshad");
		Java_static_method s2 = new Java_static_method(222,"ajith"); 
		change();
        s1.display();
        s2.display();

	}

}


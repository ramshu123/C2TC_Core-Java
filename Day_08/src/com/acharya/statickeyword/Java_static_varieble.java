package com.acharya.statickeyword;

public class Java_static_varieble {
	int rollno;
	String name;
	static String college = "ITS";
	Java_static_varieble(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	    }
	public static void main(String[] args) {
		Java_static_varieble s1 = new Java_static_varieble(111,"ramshad");
		Java_static_varieble s2 = new Java_static_varieble(222,"ajith"); 
        s1.display();
        s2.display();
	}
}

package com.acharya.parameterizedconstructor;

class Employee{
	int id;
	String name;
	float salary;
	//user defined parameterized constructor
	public Employee(int i, String n, float s) {
		id =i;
		name =n;
		salary =s;
	}
	//method
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Example2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(111,"ramshad",50000f);
        Employee e2 = new Employee(222,"ajith",50000f);
        
        e1.display();
        e2.display();


	}

}

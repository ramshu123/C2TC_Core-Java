package com.acharya.noargconstructor;
class Employee{
	int id;
	String name;
	float salary;
	//constructor
	Employee (){
		System.out.println("user defined no-arg is constructor is called");
	}
	//method
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.display();
        e2.display();


	}

}

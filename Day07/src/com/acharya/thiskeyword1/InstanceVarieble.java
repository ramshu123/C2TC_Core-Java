package com.acharya.thiskeyword1;

	class Student{
		int rollno;
		String name;
		float fee;
		//user defined parameterized constructor
		
		public Student(int rollno, String name, float fee) {
			this.rollno = rollno;
			this.name = name;
			this.fee = fee;
		}
		//method
		void display() {
			System.out.println(rollno + " " + name + " " + fee);
		}
	}

	public class InstanceVarieble { 

		public static void main(String[] args) {
			Student e1 = new Student(111,"ramshad",50000f);
			Student e2 = new Student(222,"ajith",50000f);
	        
	        e1.display();
	        e2.display();


		}

	}
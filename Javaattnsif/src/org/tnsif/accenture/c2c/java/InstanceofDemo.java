package org.tnsif.accenture.c2c.java;

class Person
{
	
}
class Employee extends Person
{
	
}
class Manager extends Employee
{
	
}
public class InstanceofDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		System.out.println(e instanceof Employee);
		System.out.println(e instanceof Manager);
		System.out.println(e instanceof Person);
		
		

	}

}

package org.tnsif.accenture.c2c.java;
class Animal5
{
 String name= "Animal";
}
class Dog5 extends Animal5
{
	String name="Dog";
	void displayNames()
	{
		System.out.println("SuperClass name"+" "+super.name);
		System.out.println("Subclass name"+" "+name);
	}
}





public class SuperFieldDemo {

	public static void main(String[] args) {
		Dog5 dog =new Dog5();
		dog.displayNames();

	}

}

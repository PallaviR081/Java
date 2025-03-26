package org.tnsif.accenture.c2c.java;

class Animal6
{
	Animal6()
	{
		System.out.println("Animal Constructor");
	}
}
class Dog6 extends Animal6
{
	Dog6(){
		super();
		System.out.println("Dog constructure");
	}
}
public class SuperConstructorDemo {

	public static void main(String[] args) {
		Dog6 dog = new Dog6();
		

	}

}

package org.tnsif.accenture.c2c.java;

class Animal1
{
	void eat()
	{
		System.out.println("Animal are eating");
	}
}
class Mammals extends Animal1
{
	void sleep()
	{
		System.out.println("Mammal is sleeping");
	}
}
class Dog1 extends Mammals
{
	void bark() {
		System.out.println("dog is barking");
	}
}



public class MultilevelInheritence {

	public static void main(String[] args) {
		Dog1 obj=new Dog1();
		obj.eat();
		obj.sleep();
		obj.bark();
		

	}

}

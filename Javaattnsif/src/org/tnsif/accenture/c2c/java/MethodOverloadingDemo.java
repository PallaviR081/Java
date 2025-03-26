package org.tnsif.accenture.c2c.java;


class MethodOverload
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a , int b, int c)
	{
		return a+b+c;
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MethodOverload m = new MethodOverload();
		System.out.println(m.add(2,4));
		

	}

}

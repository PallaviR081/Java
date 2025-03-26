package org.tnsif.accenture.c2tc.basic;

public class Demo {

	public static void main(String[] args) {
		String name="Pallavi";
		try {
		int index = name.indexOf("j");
	    System.out.println("The letter 'j' is present at index " + index);
		} catch(Exception  e)
		{
			System.out.println(e);
		}
		

	}

}

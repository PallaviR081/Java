package org.tnsif.accenture.c2c.java;

class Book
{
	String title;
	int page;
	Book()
	{
		title="unknown";
		page=0;
	}
	Book(String title)
	{
		this.title=title;
		page=0;
	}
	Book(String title,int page)
	{
		this.title =title;
		this.page = page;
	}
	void display()
	{
		System.out.println("title " +title+" "+"page "+page);
	}
	
}





public class Constructor_Overloading {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Python");
		Book book3 = new Book("Python", 10);
		book1.display();
		book2.display();
		book3.display();
		

	}

}

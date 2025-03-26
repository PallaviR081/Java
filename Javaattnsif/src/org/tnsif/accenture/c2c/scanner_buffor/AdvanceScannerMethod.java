package org.tnsif.accenture.c2c.scanner_buffor;
import java.util.Scanner;
public class AdvanceScannerMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some data (You can enter numbers or text)");
		while(scan.hasNext())
			if(scan.hasNextInt())
			{
				int intvalue=scan.nextInt();
				System.out.println("read an integer"+intvalue);
				}
			else if(scan.hasNextDouble())
			{
				double doublevalue=scan.nextDouble();
				System.out.println("read an double"+doublevalue);
				
			}
			else
			{
				String stringvalue=scan.next();
				System.out.println("unkown input"+stringvalue);
			}

	}

}

package org.tnsif.accenture.c2c.scanner_buffor;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\PRADEEP\\OneDrive\\Documents\\tnsif"));
			String data="";
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		
		}
		

	}

}
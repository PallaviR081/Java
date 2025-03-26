package org.tnsif.accenture.c2tc.basic;



public class KIA_Motors {
	String noCar;
	String model;
	int speed=100;
	
	void start()
	{
		System.out.println("vehical is started");
		
	}
	void stop() {
		System.out.println("vehical is stoped");
	}
	

	public static void main(String[] args) {
		KIA_Motors d1 = new KIA_Motors();
		d1.start();
		d1.stop();
		
		

	}

}

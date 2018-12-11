package com.cqt;

public class Admin {
	
	static void printString(String msg)
	{
		for(int i=0;i<msg.length();i++)
		{
			System.out.print(msg.charAt(i));
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Admin.main()");
		
		printString("Customer Query Tracker");
		
		System.out.println("-------------End--------------");
	}

}

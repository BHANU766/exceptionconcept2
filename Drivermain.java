package com.userdefinedexception;

public class Drivermain {

	public static void main(String[] args)  {
		
		Ticketbooking book1=new Ticketbooking();
		
	    
			
	//		try {
	//			book1.bookTicket(1,10);
	//		} catch (Invalidticketexception e)	{
	//			System.out.println(e.getMessage());
	//		} catch (Insufficientseatsexpection e) {
	//			System.out.println(e.getMessage());
	//			
	//		}//valid
			
	//		//invalid ticket number
	//	    try {
	//			book1.bookTicket(0, 5);
	//		} catch (Invalidticketexception | Insufficientseatsexpection e) {
	//			System.out.println(e.getMessage());
	//		}//invalid

		    
		    try {
				book1.bookTicket(3, 5);
			} catch (Invalidticketexception | Insufficientseatsexpection e) {
				System.out.println(e.getMessage());
			}
		    
		    
	}
	

}

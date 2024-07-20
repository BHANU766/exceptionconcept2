package com.userdefinedexception;

public class Ticketbooking {
	//available
	private int seatsavailable=30;
	
	//functionality->to book ticket
	public void bookTicket(int ticketnumber,int seats) throws Invalidticketexception, Insufficientseatsexpection {
		//check ticket  < 0
		if(ticketnumber<=0) {
			throw new Invalidticketexception("ticket number must be greater than zero");
		
			
		}
		
		//check seats
		if(seats>seatsavailable) {
			throw new Insufficientseatsexpection("not enough seats available");
		}
	
		seatsavailable-= seats;
		System.out.println("ticket booked successfully.seats remaining" +seats);
		
	}
}

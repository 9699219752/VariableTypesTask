package com.variabletypes;

public class FlightBooking {
	
	static String flightNo;
	static String source;
	static String destination;
	static double ticketPrice;
	static char passengerGender;
	
	
	
public static void main(String[] args) {
	

	int bookingId=111;
	   String passengerName="Bhagyshri";
	   short passengerAge=21;
	   
	   String passportNo="Z453555454";
	   String airlineName="Air India";
	   
	   String seatNo="34B";
	   String paymentMethod="UPI";
	   String bookingStatus="Confirmed";
	   boolean isCheckIn=false;
	   
	   
	   
	   
	System.out.println("Booking Id :" +bookingId);
	System.out.println("Passenger Name :" +passengerName);
	System.out.println("Passenger Age :" +passengerAge);
	System.out.println("Passenger Gender :" +passengerGender);
	System.out.println("Passport Number :" +passportNo);
	System.out.println("Flight Number :" +flightNo);
	System.out.println("Air line Name :" +airlineName);
	System.out.println("Source Of Plane :" +source);
	System.out.println("Destination  :" +destination);
	System.out.println("Seat Number :" +seatNo);
	System.out.println("Ticket Price :" +ticketPrice);
	System.out.println("Payment Method :" +paymentMethod);
	System.out.println("Booking Status :" +bookingStatus);
	System.out.println("Booking is Check In :" +isCheckIn);
	
}

}

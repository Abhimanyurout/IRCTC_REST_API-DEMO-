package in.abhi.service;

import in.abhi.request.Passenger;
import in.abhi.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}

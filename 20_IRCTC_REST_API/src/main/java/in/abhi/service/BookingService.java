package in.abhi.service;

import org.springframework.stereotype.Service;

import in.abhi.request.Passenger;
import in.abhi.response.Ticket;
@Service
public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}

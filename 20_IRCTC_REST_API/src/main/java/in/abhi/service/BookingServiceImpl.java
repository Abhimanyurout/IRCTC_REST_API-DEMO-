package in.abhi.service;

import java.beans.Beans;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.abhi.request.Passenger;
import in.abhi.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> ticketsMap= new HashMap<>();
	private Integer ticketNum=1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//Logic 
		
		Ticket t= new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(555.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);		
		ticketsMap.put(ticketNum, t);
		ticketNum ++;
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if(ticketsMap.containsKey(ticketNumber)) {
			return ticketsMap.get(ticketNumber);
		}
		
		return null;
	}

}




















package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
private Map<String, Ticket> ticketmap=new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
	    String ticketNum = UUID.randomUUID().toString().replace("-", "");

		
		Ticket t=new Ticket();
		t.setTicketNum(ticketNum);
		t.setName(passenger.getName());
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setJdate(passenger.getJdate());
		t.setTrainNum(passenger.getTrainNum());
		t.setTicketStatus("Confirmed");
		t.setTicketPrice(899.00);
		
		ticketmap.put(ticketNum, t);
		return t;
		
	}

	@Override
	public Ticket getTicket(String ticketNum) {
		if(ticketmap.containsKey(ticketNum)) {
		return ticketmap.get(ticketNum);
	}
	return null;
	
}
}

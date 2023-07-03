package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(String ticketNum);
}

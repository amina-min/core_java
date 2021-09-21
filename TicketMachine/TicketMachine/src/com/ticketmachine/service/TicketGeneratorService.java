
package com.ticketmachine.service;

import com.ticketmachine.model.Ticket;
import com.ticketmachine.model.TicketState;
import com.ticketmachine.model.TicketType;
import java.util.List;


public interface TicketGeneratorService {
    public List<Ticket> generate();
    public List<TicketType> generateTicketType();
    public List<TicketState> generateTicketState();
}


package com.ticketmachine.service;

import com.ticketmachine.model.Ticket;
import com.ticketmachine.model.TicketState;
import com.ticketmachine.model.TicketType;
import java.util.ArrayList;
import java.util.List;

public class TicketGeneratorImpl implements TicketGeneratorService{
    
    private final int MAX_TICKET_CICLE_LIMIT = 2;
    private final String TICKET_STATE_NEW_JERSEY = "New Jersey";
    private final String TICKET_STATE_NEW_YORK = "New York";
    
    private final String TICKET_TYPE_A = "A";
    private final String TICKET_TYPE_B = "B";
    private final String TICKET_TYPE_C = "C";

    @Override
    public List<Ticket> generate() {
        List<Ticket> tickets = new ArrayList<>();
        List<TicketType> types = generateTicketType();
        List<TicketState> states = generateTicketState();
        int ticketId = 0;
        for (TicketState state : states) {
            for (TicketType type : types) {
                for (int i = 0; i < MAX_TICKET_CICLE_LIMIT; i++) {
                    ticketId++;                    
                    tickets.add(new Ticket(ticketId, type, state, getPrice(state, type)));
                }
            }
        }
        return tickets;
    }

    @Override
    public List<TicketType> generateTicketType() {
        List<TicketType> types = new ArrayList<>();
        types.add(new TicketType(1, TICKET_TYPE_A));
        types.add(new TicketType(2, TICKET_TYPE_B));
        types.add(new TicketType(3, TICKET_TYPE_C));
        return types;
    }

    @Override
    public List<TicketState> generateTicketState() {
       List<TicketState> states = new ArrayList<>();
        states.add(new TicketState(1, TICKET_STATE_NEW_JERSEY));
        states.add(new TicketState(2, TICKET_STATE_NEW_YORK));
        return states;
    }
    
    
    private double getPrice(TicketState state, TicketType type){
        String newState = state.getName();
        String newType = type.getType();
        if(newState.equals(TICKET_STATE_NEW_JERSEY) && newType.equals(TICKET_TYPE_A)){
           return 20.90;
        }else if(newState.equals(TICKET_STATE_NEW_JERSEY) && newType.equals(TICKET_TYPE_B)){
            return 17.75;
        }else if(newState.equals(TICKET_STATE_NEW_JERSEY) && newType.equals(TICKET_TYPE_C)){
            return 15.00;
        }else if(newState.equals(TICKET_STATE_NEW_YORK) && newType.equals(TICKET_TYPE_A)){
            return 22.50;
        }else if(newState.equals(TICKET_STATE_NEW_YORK) && newType.equals(TICKET_TYPE_B)){
            return 19.75;
        }else if(newState.equals(TICKET_STATE_NEW_YORK) && newType.equals(TICKET_TYPE_C)){
            return 17.50;
        }
        return 0;
    }
    
    
}


package com.ticketmachine;

import com.ticketmachine.model.Ticket;
import com.ticketmachine.service.SaleService;
import com.ticketmachine.service.SaleServiceImpl;
import com.ticketmachine.service.TicketGeneratorImpl;
import com.ticketmachine.service.TicketGeneratorService;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        TicketGeneratorService tgService = new TicketGeneratorImpl();
        List<Ticket> tickets = tgService.generate();
        
        SaleService saleService = new SaleServiceImpl(tickets);
        saleService.start();
       // displayTicket(tickets);
    }

    private static void displayTicket(List<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println("ID: " + ticket.getId());
            System.out.println("Type: " + ticket.getType());
            System.out.println("State: " + ticket.getState());
            System.out.println("Price: " + ticket.getPrice());
        }
    }
}

package com.ticketmachine.service;

import com.ticketmachine.model.Ticket;


public interface SaleService {
    public void start();
    public boolean ticketSell(Ticket ticket);
    public boolean addSellHistory(Ticket ticket);
}

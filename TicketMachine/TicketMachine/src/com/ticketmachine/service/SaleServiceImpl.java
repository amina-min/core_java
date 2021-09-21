package com.ticketmachine.service;

import com.ticketmachine.model.Ticket;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SaleServiceImpl implements SaleService {

    private List<Ticket> tickets;
    private List<Ticket> soledTickets;
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static DecimalFormat df = new DecimalFormat("#.##");

    public SaleServiceImpl(List<Ticket> tickets) {
        this.tickets = tickets;
        soledTickets = new ArrayList<>();
    }

    @Override
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String state = quiz1(sc);
            String type = quiz2(sc);
            String stateTitle = state.equals("1") ? "New Jersey" : "New York";
            //double actualPrice = getPrice(stateTitle, type);
            Ticket ticket = getTicket(state, type);

            if (ticket != null) {
                double price = quiz3(sc, stateTitle, type.toUpperCase(), ticket.getPrice());
                boolean isSelled = ticketSell(ticket);
                if (isSelled) {
                    System.out.println(""
                            + "Thank you. \n"
                            + "Please take your ticket.\n"
                            + "You change is " + (df.format(price - ticket.getPrice())) + " please take them.");
                } else {
                    System.out.println("=========================");
                }
            } else {
                System.out.println(stateTitle + " " + type + " are SOLD OUT.");
            }
        }

    }

    @Override
    public boolean ticketSell(Ticket ticket) {

        if (addSellHistory(ticket)) {
            return tickets.remove(ticket);
        } else {
            return false;
        }

    }

    @Override
    public boolean addSellHistory(Ticket ticket) {
        return soledTickets.add(ticket);
    }

    private String quiz1(Scanner sc) {
        String stateMsg = "Which state you buy ticket to: (1: New Jersey, 2: New York): ";
        System.out.println(stateMsg);
        String state = sc.next();
        boolean ctlState = true;
        while (ctlState) {
            if (state.equals("1")) {
                ctlState = false;
            } else if (state.equals("2")) {
                ctlState = false;
            } else {
                ctlState = true;
                System.out.println(stateMsg);
                state = sc.next();
            }
        }
        return state;
    }

    private String quiz2(Scanner sc) {
        String typeMsg = "Which tikcet class you want to buy (A, B, C)";
        System.out.println(typeMsg);
        String type = sc.next().toUpperCase();
        boolean ctlType = true;
        while (ctlType) {
            if (type.equals("A")) {
                ctlType = false;
            } else if (type.equals("B")) {
                ctlType = false;
            } else if (type.equals("C")) {
                ctlType = false;
            } else {
                ctlType = true;
                System.out.println(typeMsg);
                type = sc.next().toUpperCase();
            }
        }
        return type;
    }

    private double quiz3(Scanner sc, String subMessage, String ticketClass, double actualPrice) {
        String priceMsg = "The price of " + subMessage + " ticket class " + ticketClass + " is " + actualPrice + " :";
        System.out.println(priceMsg);
        String price = sc.nextLine();
        price = sc.nextLine();
        double newPrice = 0;
        double finalPrice = 0;
        boolean ctlPrice = true;
        while (ctlPrice) {
            try {
                if (isNumeric(price)) {
                    newPrice = Double.parseDouble(price);
                    if (validPrice(newPrice)) {
                        finalPrice += newPrice;
                        if (finalPrice >= actualPrice) {
                            ctlPrice = false;
                        } else {
                            ctlPrice = true;
                            ctlPrice = true;
                            System.out.println("You have pay $" + finalPrice + ", put more: ");
                            price = sc.nextLine();
                        }

                    } else {
                        ctlPrice = true;
                        System.out.println("Rejected, You have pay $" + finalPrice + " put more: ");
                        price = sc.nextLine();
                    }
                } else {
                    ctlPrice = true;
                    System.out.println("Re: " + priceMsg);
                    price = sc.nextLine();
                }
            } catch (Exception e) {
            }
        }
        return finalPrice;
    }

    private boolean validPrice(double price) {
        if (price == 100.0 || price == 50.0 || price == 20.0
                || price == 10.0
                || price == 5.0
                || price == 1.0
                || price == 0.25
                || price == 0.10
                || price == 0.50) {
            return true;
        }
        return false;
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    private double getPrice(String state, String type) {
        for (Ticket ticket : tickets) {
            if (ticket.getState().getName().equals(state) && ticket.getType().getType().equals(type)) {
                return ticket.getPrice();
            }
        }
        return -1;
    }

    private Ticket getTicket(String state, String type) {
        String stateTitle = state.equals("1") ? "New Jersey" : "New York";
        for (Ticket ticket : tickets) {
            if (ticket.getState().getName().equals(stateTitle) && ticket.getType().getType().equals(type)) {
                return ticket;
            }
        }
        return null;
    }

}

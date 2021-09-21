package com.projectBkas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    private int customarId;
    private int pinNumber;
    private double balenceSave;
    private double balanceCheck;

    public Account(int id, int pinNumber, int balanceCheck) {
        this.customarId = id;
        this.pinNumber = pinNumber;
        this.balanceCheck = balanceCheck;
    }

    public double getBalenceSave() {
        return balenceSave;
    }

    public void setBalenceSave(int balenceSave) {
        this.balenceSave = balenceSave;
    }

    public double getBalanceCheck() {
        return balanceCheck;
    }

    public void setBalanceCheck(int balanceCheck) {
        this.balanceCheck = balanceCheck;
    }

    public int getCustomarId() {
        return customarId;
    }

    public void setCustomarId(int customarId) {
        this.customarId = customarId;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double CheckingWithdraw(double amount) {
        balanceCheck = (balanceCheck - amount);
        return balanceCheck;
    }

    public double savingWithdraw(double amount) {
        balenceSave = (balenceSave - amount);
        return balenceSave;
    }

    public double checkingDiposite(double amount) {
        balanceCheck = (balanceCheck + amount);
        return balanceCheck;
    }

    public double savingDiposite(double amount) {
        balenceSave = (balenceSave + amount);
        return balenceSave;
    }

    public void CheckingWithdrawInput() {
        System.out.println("Checking account Balance " + moneyFormat.format(balanceCheck));
        System.out.println("Amount you want to withdraw from checking Account ");
        double amount = sc.nextInt();
        if ((balanceCheck - amount) >= 0) {
            CheckingWithdraw(amount);
            System.out.println("New Checking account Balance " + moneyFormat.format(balanceCheck));

        } else {
           System.out.println("Balance cannot be negetive "+"\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving account balance " + moneyFormat.format(balenceSave));
        System.out.println("Amount you want to withdraw from saving Account ");
        double amount = sc.nextDouble();
        if ((balenceSave - amount) >= 0) {
            System.out.println("New saving account Balance " + balenceSave + "\n");

        } else {
           System.out.println("Balance cannot be negetive "+"\n");

        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking account  Balance "+ moneyFormat.format(balanceCheck));
        System.out.println("Amount you want to withdraw from Checking Account ");
        double amount=sc.nextDouble();
        if((balanceCheck-amount)>=0){
            checkingDiposite(amount);
            System.out.println("New Checking account Balance " + moneyFormat.format(balanceCheck));
        }else{
            System.out.println("Balance cannot be negetive "+"\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("saving account  Balance "+ moneyFormat.format(balenceSave));
        System.out.println("Amount you want to withdraw from saving Account ");
        double amount=sc.nextDouble();
        if((balenceSave+amount)>=0){
            savingDiposite(amount);
            System.out.println("New Checking account Balance " + moneyFormat.format(balenceSave));
        }else{
            System.out.println("Balance cannot be negetive "+"\n");
        }
    }

}



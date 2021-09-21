package s_javaproject.newpackage;

import java.util.Scanner;

public class Bkas {

    static int balance = 5000;
    static Scanner sc = new Scanner(System.in);
    static int passWord = 26845;

    public static void main(String[] args) {

        System.out.println("enter number");
        String num = sc.nextLine();
        String num1 = "*247#";
        if (num.equals(num1)) {
            String[] arr = {"1. Sand Money", "2. Send Money to Bkash Non User", "3. Mobile Recharge", "4. Payment",
                "5. Cash Out", "6. Pay Bill", "7. My Bkash"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }

        } else {
            System.out.println("not valid");
        }
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                SandMoney();
                break;
            case 2:
                SendMoneyToNonUser();
                break;

            case 3:
                MobileRecharge();
                break;
            case 4:
                Payment();
                break;
            case 5:
                CashOut();
                break;
            case 6:
                PayBill();
                break;
            case 7:
                MyBkash();
                break;

        }

    }
  

  
     private static void SandMoney() {
        System.out.println("enter mobile number");
        sc.nextLine();
        String mobile = sc.nextLine();

        System.out.println("enter amount");
        int amount = sc.nextInt();
        //System.out.println(mobile);
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("transfar successfully ");
            balance -= amount;
            System.out.println("remain blance = " + balance);
        } else {
            System.out.println("invalid password");
        }
    }

    private static void SendMoneyToNonUser() {
        System.out.println("send money to non bkash user");
        sc.nextLine();
        System.out.println("enter mobile number");
        String mobile = sc.nextLine();
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("transaction successfullay");
            balance -= amount;
            System.out.println("remain balance =" + balance);
        } else {
            System.out.println("invalid password");
        }
    }
   
    private static void MobileRecharge() {

        String[] arr = {"1. grameen", "2. airtal", "3. robi", "4. taletalk", "5. banglalink"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("select opretor");
        int ch = sc.nextInt();

        System.out.println("recharge");
        System.out.println("enter mobile number");
        sc.nextLine();
        String mobile = sc.nextLine();
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("recharge successfully");
            balance -= amount;
            System.out.println("remain balance = " + balance);
        } else {
            System.out.println("invalid password");
        }

    }

     private static void Payment() {
        System.out.println("payment your expence");
        sc.nextLine();
        System.out.println("enter mobile number");
        String mobile = sc.nextLine();
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("transaction successfullay");
            balance -= amount;
            System.out.println("remain balance = " + balance);
        } else {
            System.out.println("invalid password");

        }
    }

    private static void CashOut() {
        System.out.println("Cash Out");
        System.out.println("select option");
        String[] UserType = {"1. Personal number", "2. Agent number"};
        for (int i = 0; i < UserType.length; i++) {
            System.out.println(UserType[i]);
        }
        int selectOption = sc.nextInt();
        sc.nextLine();
        System.out.println("enter mobile number");
        String mobile = sc.nextLine();
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("transaction successfullay");
            balance -= amount;
            System.out.println("remain balance = " + balance);
        } else {
            System.out.println("invalid password");
        }
    }

    private static void PayBill() {
        System.out.println("payment your bill");

        String[] BillType = {"1. Gass bill", "2. Water bill", "3. Electricity bill", "4. Internet bill"};
        for (int i = 0; i < BillType.length; i++) {
            System.out.println(BillType[i]);
        }
        System.out.println("select option");
        int select = sc.nextInt();
        sc.nextLine();
        System.out.println("enter mobile number");
        String mobile = sc.nextLine();
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("transaction successfullay");
            balance -= amount;
            System.out.println("remain balance = " + balance);
        } else {
            System.out.println("invalid password");

        }
    }

    private static void MyBkash() {
        System.out.println("check balance");
        System.out.println("enter password");
        int pass = sc.nextInt();
        if (pass == passWord) {
            System.out.println("remain balance = " + balance);
        } else {
            System.out.println("invalid password");

        }
    }
}

package class_test;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking prime");
        int num = sc.nextInt();
        
        boolean value=isPrime(num);
        
        if(value){
            System.out.println(num+ " is a prime num");
        }else{
            System.out.println(num +" is not a prime num");
        }

    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%2==0){
            return false;
            }
        }
        return true;
    }
}

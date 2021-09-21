/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicpractice;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
      
}

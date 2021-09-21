/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicpractice;

import java.util.Scanner;


public class CelsToFarn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  celcious ");
        double c=input.nextDouble();
        
        double farn=(9/5)*c+32;
        System.out.println("farenite  of "+c+ " is : "+farn);
        
        System.out.println("Enter  farenhite ");
        
        double f=input.nextDouble();
        double cels=((f-32)*5)/9;
        System.out.println("celcious  of "+f+ " is : "+cels);
        
        
        
    }
    
            
}

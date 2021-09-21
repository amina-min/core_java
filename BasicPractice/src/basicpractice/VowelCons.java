
package basicpractice;

import java.util.Scanner;


public class VowelCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter ");
        
        char ch=sc.next().charAt(0);
        
         if(ch=='a'){
            System.out.println("vowel");
        }else if(ch=='e'){
            System.out.println("vowel");
        }else if(ch=='i'){
            System.out.println("vowel");
        }else if(ch=='o'){
        System.out.println("vowel");
        }else if(ch=='u'){
            System.out.println("vowel");
        }else
            System.out.println("consonent");
    }
}

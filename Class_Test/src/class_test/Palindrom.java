
package class_test;

import java.util.Scanner;


public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write something to find palindrom");
        String s1=sc.nextLine();
        String s2="";
        for (int i = s1.length()-1; i >= 0; i--) {
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println(s2+" is palindrom");
        }else
            System.out.println(s2+ " is not palindrom");
            
    }
}

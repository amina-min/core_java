package basicpractice;

import java.util.Scanner;

public class selectionStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int num = sc.nextInt();

        if (num > 0) {
                System.out.println("Positive");
            }else{
            System.out.println("Negetive");
        }
        
    }
}

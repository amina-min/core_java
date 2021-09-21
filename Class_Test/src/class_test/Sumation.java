
package class_test;
import java.util.Scanner;
public class Sumation{
	public static void main (String[] args){
		 Scanner input = new Scanner (System.in);
                 
		 int i= 0;
		 int sum = 0;
		 while (i != -1){
			 sum+=i;
		System.out.println("Enter a value");
		i = input.nextInt();
			 
		 }
		System.out.println("Total " + sum);
		
		
	}
}
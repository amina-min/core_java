
package qusNo1;
import java.util.Scanner;
public class MainArea {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length :");
        int num1=sc.nextInt();
        
        System.out.println("Enter breadth :");
        int num2=sc.nextInt();
        
        Area obj= new Area();
        obj.length=num1;
        obj.breadth=num2;
        
        System.out.println(obj.getArea());
        
        
    }
    
}

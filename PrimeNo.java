import java.util.Scanner;
public class PrimeNo{	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System .out.println("enter a value to chack primr number");
		int num=sc.nextInt();
		
		boolean value = isPrime (num);
		
		if(value){
			System.out.println(num+ " is a prime number");
		}else{
			System.out.println(num+ " is not a prime number");

		}
	}
	
	
	public static boolean isPrime(int num){
		if(num<2) return false;
		for(int i=2; i<num ; i++){
            if(num%i==0){
                 return false;
			}
		}
		return true;
		
	}	
	
}
	
	
	
	

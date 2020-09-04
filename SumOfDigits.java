package practise;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Provide Inputs:");
			int num = scn.nextInt();	//1234

			int sum=0;
			
			while(num>=1) {
				int a = num % 10; 		
				sum = sum + a;  		
				num = num/10; 			
			}
			
			System.out.println(sum);
			scn.close();
	}
}

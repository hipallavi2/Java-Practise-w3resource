package practise;
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
//		Write a Java program that takes three numbers as input to calculate 
//		and print the average of the numbers
		Scanner scn= new Scanner(System.in);
		
		System.out.println("First Number");
		int num = scn.nextInt();
		
		System.out.println("Second Number");
		int num1 = scn.nextInt();
		
		System.out.println("Third Number");
		int num2 = scn.nextInt();
		System.out.println("Average of given numbers= "+ (num+num1+num2)/3);
		scn.close();
		
		}
}

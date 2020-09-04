package practise;
import java.util.Scanner;
public class Question32 {

	public static void main(String[] args) {
//		Write a Java program to compare two numbers.
//		Input first integer: 25
//		Input second integer: 39
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = scn.nextInt();
		System.out.println("Enter second number :");
		int num2 = scn.nextInt();
		if(num1>num2) {
			System.out.println(num1 + " is greater");
		}
		else {
			System.out.println(num2 + " is greater");
		}
		scn.close();
	}
		
}

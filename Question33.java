package practise;
import java.util.Scanner;
public class Question33 {
	public static void main(String[] args) {
//		 Write a Java program and compute the sum of the digits of an integer. Go to the editor
		Scanner scn = new Scanner(System.in);
		System.out.println("Give First Number : ");
		int num1 = scn.nextInt();
		int a = num1 % 10; //gives remainder 42%10=2
		int b = num1 / 10; // gives quotient 42/10=4
		System.out.println("Adding digits of a number = "+ (a+b) );
		scn.close();
		
	}

}

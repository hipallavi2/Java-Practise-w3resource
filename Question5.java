package practise;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
//		Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//		Test Data:
//		Input first number: 25
//		Input second number: 5
		Scanner scn = new Scanner(System.in);
		System.out.println("Please give first number");
		int num1 = scn.nextInt();
		System.out.println("Please give second number");
		int num2 = scn.nextInt();
		System.out.println(num1 + "*" + num2 + "=" +  num1 * num2 );
		scn.close();
	}

}

package practise;
import java.util.Scanner;
public class BasedOnQ33 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Give Inputs");
		int num = scn.nextInt(); //251
		
		int a= num % 10; //1
		int temp = num / 10; //25
		int b = temp % 10; //5
		int c = temp / 10; //2
		
		System.out.println("sum: "+(a+b+c));
		scn.close();
		}
}

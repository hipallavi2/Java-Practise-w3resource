package practise;
import java.util.Scanner;
public class Question35 {
	public static void main(String[] args) {
//		Write a Java program to compute the area of a polygon.
//		Area of a polygon = (n*s^2)/(4*tan(π/n))
//		where n is n-sided polygon and s is the length of a side
//		Input the number of sides on the polygon: 7
//		Input the length of one of the sides: 6
		Scanner scn = new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon:");
		
		int sides = scn.nextInt();
		System.out.println("Input the length of one of the sides:");
		
		int length = scn.nextInt();
		double area = (length*sides*sides)/(4*Math.tan(Math.PI/length));
		
		System.out.println("Area of Polygone :- "+ area);
		scn.close();
	}
}

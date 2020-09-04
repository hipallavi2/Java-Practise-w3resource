package practise;
import java.util.Scanner;
public class Question34 {

	public static void main(String[] args) {
//		Write a Java program to compute the area of a hexagon. Go to the editor
//		Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//		where s is the length of a side
//		Input the length of a side of the hexagon: 6
			Scanner scn = new Scanner(System.in);
			System.out.println("Input the length of a side of the hexagon:");
			int num = scn.nextInt();
			double area=(6*num*num)/(4* Math.tan(Math.PI/6));
			System.out.println("Area of Hexagonal:- "+ area);
			scn.close();
	}

}

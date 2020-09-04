package practise;
import java.util.Scanner;
public class Question36 {
	public static void main(String[] args) {
//		Write a Java program to compute the distance between two points on the surface of earth.
//		Distance between the two points [ (x1,y1) & (x2,y2)]
//		d = radius * arc cos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//		Radius of the earth r = 6371.01 Kilometers
//		Input the latitude of coordinate 1: 25
//		Input the longitude of coordinate 1: 35
//		Input the latitude of coordinate 2: 35.5
//		Input the longitude of coordinate 2: 25.5
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input the latitude of coordinate 1:");
		double lat1 = scn.nextDouble();

		System.out.println("Input the longitude of coordinate 1:");
		double lon1 = scn.nextDouble();
	
		System.out.println("Input the latitude of coordinate 2:");
		double lat2 = scn.nextDouble();
		
		System.out.println("Input the longitude of coordinate 2:");
		double lon2 = scn.nextDouble();
		
		double earthRadius= 6371.01; //km;
		
		double distance = earthRadius * Math.cos(Math.sin(lat1)* Math.sin(lat2)
				+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1-lon2));
		
		System.out.println("Distance between 2 points are: "+ distance);
		scn.close();
		
	}
}

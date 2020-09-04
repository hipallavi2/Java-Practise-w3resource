package practise;
import java.util.Scanner;
public class SumOfD {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Provide inputs");
		
		int num = scn.nextInt();     //1254
		
		int sum = 0;
		while(num>=1) {
			int a = num%10;           // 4
			sum = sum+a;
			num = num/10;
		}
		System.out.println(sum);
		scn.close();
	}

}

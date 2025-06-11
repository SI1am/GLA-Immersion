package practice;
import java.util.*;
public class simpleintrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		float t=sc.nextFloat();
		double si=(p*r*t)/100;
		System.out.println("The simple interest i" + si);
	}
}

package practice;
import java.util.*;
public class VolumeofaCylinder {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double a=3.14*radius*radius*height;
        System.out.println("Volume of a Cylinder is: " + a);
        sc.close();
    }
}

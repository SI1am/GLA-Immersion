package practice;
import java.util.*;
public class CelsiustoFahrenheitConversion {
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float c=sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println("Temperature in Fahrenheit is: " + f);
        sc.close();
    }
}

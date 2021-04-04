import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int digit1=6;
	    double digit2 =8.2;
	    double digit3=0.0;
	    
	    digit3= digit2* (double)digit1;
		System.out.println("Digit1 = "+digit1+"\n Digit2 = "+digit2+"\n Product of two digits = "+String.format("%.2f",digit3));
	}
}
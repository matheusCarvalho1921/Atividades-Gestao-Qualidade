package pratica1;
import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celsius, Fahrenheit;
		
		System.out.println("qual a temperatura em celsius?");
		celsius = input.nextDouble();
		
		Fahrenheit = (celsius*1.8)+32;
		
		System.out.println("a temperatura em Fahrenheit é " +Fahrenheit );
	}

}

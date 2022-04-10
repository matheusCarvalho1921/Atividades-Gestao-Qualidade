package pratica1;
import java.util.Scanner;
public class Dolar {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double reais, dolares;
		
		System.out.println("Digite seu dinheiro em reais ");
		
		reais = input.nextDouble();
		
		dolares = reais*4.70;
		
		System.out.print("Seu dinheiro em dolares é  " + dolares);

	}

}

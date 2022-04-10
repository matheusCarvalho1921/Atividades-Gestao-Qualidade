package pratica1;
import java.util.Scanner;
public class Pitagoras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double primeiroCateto, segundoCateto, hipotenusa, hipotenusaFinal;
		
		System.out.println("informe o primeiro cateto");
		primeiroCateto = input.nextDouble();
		
		System.out.println("informe o segundo cateto");
		segundoCateto = input.nextDouble();
		
		hipotenusa = Math.pow(primeiroCateto, 2) + Math.pow(segundoCateto, 2);
		
		hipotenusaFinal = Math.sqrt(hipotenusa);
		
		
		System.out.format("a hipotenusa é igual a %.2f",hipotenusaFinal);

	}

}

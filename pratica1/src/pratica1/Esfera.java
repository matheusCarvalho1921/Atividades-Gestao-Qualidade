package pratica1;
import java.util.Scanner;
public class Esfera {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			double raio,circuferencia,volume,area;
			
			System.out.println("informe o raio");
			raio = input.nextDouble();
			
			circuferencia = 2 * Math.PI *raio;
			System.out.format("a circuferencia é %.2f",circuferencia);
			
			area = Math.PI * Math.pow(raio, 2);
			System.out.format("a area é %.2f",area);
			
			volume = (Math.PI* Math.pow(raio, 3)*4)/3;
			System.out.format("o volume é %.2f",volume);

	}

}

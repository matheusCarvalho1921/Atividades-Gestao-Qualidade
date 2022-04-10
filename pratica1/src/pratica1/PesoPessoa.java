package pratica1;
import java.util.Scanner;
public class PesoPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pesoAtual, seEmagrecer, seEngordar;
		
		System.out.println("informe o peso atual");
		pesoAtual = input.nextDouble();
		
		seEmagrecer = pesoAtual-(pesoAtual*20/100);
		
		seEngordar = pesoAtual+(pesoAtual*15/100);
		
		System.out.format("Se a pessoa engordar ela pesará 2.f%" ,seEngordar,"kg");
		System.out.format("Se a pessoa emagrecer ela pesará  2.f%" ,seEmagrecer,"kg");


	}

}

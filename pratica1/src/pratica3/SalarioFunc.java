package pratica3;
import java.util.Scanner;
public class SalarioFunc {

	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
		
		
		double salarioAtual;
		double diferenca;
		double novoSalario;
		
		System.out.println("informe o seu salário");
		salarioAtual = input.nextDouble();
		
		diferenca = salarioAtual* 25/100;
		
		novoSalario = salarioAtual+diferenca;
		
		System.out.format("o novo salario é %.2f" ,novoSalario);

	}

}

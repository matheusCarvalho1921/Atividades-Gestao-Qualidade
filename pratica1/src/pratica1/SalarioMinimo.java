package pratica1;
import java.util.Scanner;
public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioMinimo, salarioFuncio, quantidadeSalarios;
		
		salarioMinimo =  1212;
		
		System.out.println("informe o salario do funcionario");
		salarioFuncio = input.nextDouble();
		
		quantidadeSalarios = salarioFuncio/salarioMinimo;
		
		
		System.out.format("cabem %.2f" , quantidadeSalarios );

	}

}

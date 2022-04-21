package pratica4;
import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
		

double  imc, peso, altura;

System.out.println("Digite o peso");
peso = input.nextDouble();

System.out.println("Digite a altura ");
altura = input.nextDouble();

imc = peso/(Math.pow(altura, 2));

System.out.println(imc);


if (imc<20) {
	System.out.println("abaixo do peso");}
else if (imc >=20 && imc <=25) {
	System.out.println("Normal");
	}
else if (imc >=25 && imc <=30) {
	System.out.println("sobrepeso");
}

else {
	System.out.println("Obesidade");
}

	}

}

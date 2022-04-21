package pratica4;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
		
		int l1,l2,l3;
		
		
		System.out.println("Digite o primeiro lado");
		l1 = input.nextInt();
		
		System.out.println("Digite o segundo lado");
		l2 = input.nextInt();
		
		System.out.println("Digite o terceiro lado");
		l3 = input.nextInt();
		
		if (l1==l2 && l2==l3) {
			System.out.println("é equilátero");}
		else if (l1==l2 || l2==l3||l3==l1){
			System.out.println("é isósceles ");
		}
		else {
			System.out.println("é escaleno");
			
		}

	}

}

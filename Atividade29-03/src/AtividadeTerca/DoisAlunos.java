package AtividadeTerca;
import java.util.Scanner;

public class DoisAlunos {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int n1,n2,m;
		
		System.out.println("digite a primeira nota:");
		n1 = input.nextInt();
		
		System.out.println("digite a segunda nota:");
		n2 = input.nextInt();
		
		m = (n1+n2)/2;
		
		
		if(m >= 7) {
			System.out.println("Aprovado");
		}
		else 
			System.out.println("Reprovado");
		
		
		
		

	}

}

package AtividadeTerca;
import java.util.Scanner;
public class TresNotas {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n1,n2,n3, m;
		
		System.out.println("digite a primeira nota:");
		n1 = input.nextInt();
		
		System.out.println("digite a segunda  nota:");
		n2 = input.nextInt();
		
		System.out.println("digite a terceira nota:");
		n3 = input.nextInt();
		
		m = (n1+n2+n3)/3;
		System.out.println(m);
		
		
		if(m >=0 && m<3) {
			System.out.println("Reprovado");
		}
		else if(m>=3 && m<7){
			System.out.println("Exame ");
		}
		else {
			System.out.println("Aprovado");
			
		}

	}

}

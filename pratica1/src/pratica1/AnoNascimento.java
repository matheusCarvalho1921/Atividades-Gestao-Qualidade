package pratica1;
import java.util.Scanner;
public class AnoNascimento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int An, Aa, idade, idade2050;
		
		System.out.println("digite o ano atual");
		Aa =  input.nextInt();
		
		System.out.println("digite o ano de nascimento");
		An =  input.nextInt();
		
		
		idade = Aa - An;
		System.out.println("a idade é"  +idade);
		
		idade2050 = 2050-An;
		
		System.out.println("em 2050 terá"  +idade2050);
		
	
	

	}

}

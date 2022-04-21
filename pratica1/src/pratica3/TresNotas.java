package pratica3;
import java.util.Scanner;

public class TresNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c, media;
		
		System.out.println("Digite a primeira nota");
		a = input.nextInt();
		
		System.out.println("Digite a segunda nota");
		b = input.nextInt();
		
		System.out.println("Digite a terceira nota");
		c = input.nextInt();
		
		media = (a+b+c)/3;
		
		System.out.println("A média é " +media);
		

	}

}

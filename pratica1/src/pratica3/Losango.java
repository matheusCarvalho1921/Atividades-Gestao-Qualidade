package pratica3;
import java.util.Scanner;
public class Losango {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			int area, diagonalMaior, diagonalMenor;
			
			System.out.println("informe a diagonal maior");
			diagonalMaior = input.nextInt();
			System.out.println("informe a diagonal menor ");
			diagonalMenor = input.nextInt();
			
			area = (diagonalMaior*diagonalMenor)/2;
			
			System.out.println("A área do losango é " +area);

	}

}

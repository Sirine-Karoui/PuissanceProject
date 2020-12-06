package metier;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CalculPuissance fen = new CalculPuissance(); 
			@SuppressWarnings("resource")
			Scanner src = new Scanner(System.in);
			System.out.println ("donner a");
			double a=src.nextDouble();
			System.out.println("donner b");
			double b=src.nextDouble();
			double p = fen.calcul_p(a,b);
			System.out.println(p);
	}

}

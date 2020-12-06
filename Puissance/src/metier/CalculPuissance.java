package metier;

public class CalculPuissance {
	public double calcul_p (double a, double b) {
		double p=1;
		for (int i=1; i<=b ; i++) {
			p*=a;
		}
		return p;
	}
}

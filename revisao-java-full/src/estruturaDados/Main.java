package estruturaDados;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		System.out.println(y + " Milhões de reais!");
		System.out.printf("%.2f%n", x);
		Locale.setDefault(new Locale("pt", "BR"));
	}

}

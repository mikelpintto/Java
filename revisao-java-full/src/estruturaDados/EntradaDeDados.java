package estruturaDados;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		// utilizar um objeto do tipo scanner
		Scanner sc = new Scanner(System.in);

		// String x;
		// x = sc.next();
		// int x = sc.nextInt();
		// double x = sc.nextDouble();
		// char x = sc.next().charAt(0);
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// System.out.println("Você digitou: " + x);
		sc.close();
	}

}

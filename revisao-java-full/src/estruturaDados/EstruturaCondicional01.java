package estruturaDados;
import java.util.Scanner;

public class EstruturaCondicional01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um numero inteiro: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else if (numero >= 0) {

			System.out.println("NAO NEGATIVO");
		}

		sc.close();

	}

}

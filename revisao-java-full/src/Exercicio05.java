import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigoDePeca1, numeroDePecas1, codigoDePeca2, numeroDePecas2;

		double valorUnitarioDeCadaPeca1, valorUnitarioDeCadaPeca2, valorSerPago;

		codigoDePeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitarioDeCadaPeca1 = sc.nextDouble();
		codigoDePeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitarioDeCadaPeca2 = sc.nextDouble();

		valorSerPago = numeroDePecas1 * valorUnitarioDeCadaPeca1 + numeroDePecas2 * valorUnitarioDeCadaPeca2;

		System.out.printf("VALOR A PAGAR: %.2f%n", valorSerPago);

		sc.close();
	}

}

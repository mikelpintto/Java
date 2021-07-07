package estruturaDados;
import java.util.Scanner;

public class EstruturaWhile02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		System.out.println("Digite a primeira coordenada: ");
		x = sc.nextInt();
		System.out.println("Digite a segunda coordenada: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x >= 0 && y >= 0) {
				System.out.println("Primeiro Quadrante");
			} else if (x <= 0 && y >= 0) {
				System.out.println("Segundo Quadrante");
			} else if (x <= 0 && y <= 0) {
				System.out.println("Terceiro Quadrante");
			} else if (x >= 0 && y <= 0) {
				System.out.println("Quarto Quadrante");
			}
			System.out.println();
			System.out.println();
			System.out.println("Digite a primeira coordenada: ");
			x = sc.nextInt();
			System.out.println("Digite a segunda coordenada: ");
			y = sc.nextInt();
		}
		System.out.println("Nulo");
		sc.close();
	}

}

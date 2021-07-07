package matriz;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o numero de linha e colunas: ");
		int linha = sc.nextInt();
		System.out.print("Entre com o numero de colunas: ");
		int coluna = sc.nextInt();

		int[][] mat = new int[linha][coluna];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Escolha um numero: ");
		int numero = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (numero == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}
			}
		}

		sc.close();

	}

}

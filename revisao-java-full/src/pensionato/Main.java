package pensionato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante[] estudante = new Estudante[10];
		System.out.print("Quantos quartos foram alugados: ");
		int n = sc.nextInt();
		for(int i=1; i<n; i++) {
			sc.nextLine();
				System.out.print("Informe o nome do estudante: ");
				String nome = sc.nextLine();
				System.out.print("Informe o email do estudante: ");
				String email = sc.nextLine();
				System.out.println("Informe o numero do quarto: ");
				int numeroQuarto = sc.nextInt();
				estudante[numeroQuarto] = new Estudante(nome, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i =0; i<estudante.length; i++) {
			if(estudante[i] != null) {
			System.out.println(i + ", " + estudante[i]);
			}
		}

		sc.close();

	}

}

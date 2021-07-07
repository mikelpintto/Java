package vetor;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		Produto[] produto = new Produto[tamanho];

		for (int i = 0; i < produto.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double preco = sc.nextDouble();
			produto[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<produto.length; i++) {
			
			soma += produto[i].getPreco();
		}
		
		double media = soma / tamanho;
		
		System.out.printf("A media do preço é: %.2f%n", media);

		sc.close();

	}
}

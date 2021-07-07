package entidade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// adicionando um novo produto
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o preço do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Entre com a quantidade: ");
		int quantidade = sc.nextInt();
		// criando um objeto da classe produto
		Produto p = new Produto(nome, preco, quantidade);
		System.out.println();
		System.out.println("Prdutos: " + p);

		// adiconando uma nova quantidade de produto
		System.out.println();
		System.out.print("Entre com os produtos para ser adicionados:");
		quantidade = sc.nextInt();
		p.addProdutos(quantidade);
		System.out.println("Prdutos Adicionados: " + p);

		// removendo a quantidade produtos
		System.out.println();
		System.out.print("Entre com os produtos para ser removidos: ");
		quantidade = sc.nextInt();
		p.deleteProduto(quantidade);
		System.out.println("Prdutos: " + p);

		sc.close();

	}

}

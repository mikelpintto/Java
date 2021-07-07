package entidade;

import java.util.Scanner;

public class Produto {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double totalValorNoEstoque() {

		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void deleteProduto(int quantidade) {

		this.quantidade -= quantidade;
	}

	public String toString() {

		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " Total: $"
				+ String.format("%.2f", totalValorNoEstoque());
	}

}

package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TrabalhandoComLista {

	public static void main(String[] args) {

		// criar a lista com o String
		List<String> list = new ArrayList<>();

		System.out.println("----------------inserindo novos elementos na lista---------------");
		list.add("Miguel");
		list.add("Fabio");
		list.add("Bob");
		list.add("Anna");

		// imprimindos os elementos da lista
		for (String lista : list) {
			System.out.println("Nome: " + lista);
		}

		System.out.println("----------------inserindo elemento na lista na posição 2---------------");
		list.add(2, "Vinicius");
		// imprimindos os elementos da lista
		for (String lista : list) {
			System.out.println("Nome: " + lista);
		}

		System.out.println("---------------imprime o tamanho da lista----------------");
		System.out.println(list.size());

		System.out.println("---------------remove elemento da lista pelo nome----------------");
		list.remove("Anna");
		// imprimindos os elementos da lista
		for (String lista : list) {
			System.out.println("Nome: " + lista);
		}

		System.out.println("--------------remove da lista pela posicao-----------------");
		list.remove(0);
		// imprimindos os elementos da lista
		for (String lista : list) {
			System.out.println("Nome: " + lista);
		}
		
		System.out.println("--------------remove o elemento da lista pelo predicado-----------------");
		list.removeIf(lista -> lista.charAt(0) == 'F');
		// imprimindos os elementos da lista
		for (String lista : list) {
			System.out.println("Nome: " + lista);
		}
		
		System.out.println("--------------encontrar a posição de um elemento-----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("--------------encontrar a posição de um elemento que não existe na lista-----------------");
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		System.out.println("--------------filtrar a lista com todos que começam com A-----------------");
		List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'A').collect(Collectors.toList());
		// imprimindos os elementos da lista
		for (String lista : result) {
			System.out.println("Nome: " + lista);
		}
		
		System.out.println("--------------Comando para retornar a lista colocando o primeiro predicado-----------------");
		String nome = list.stream().filter(lista -> lista.charAt(0) == 'A').findFirst().orElse(null);
		// imprimindos os elementos da lista
		System.out.println(nome);
		

}
	
}

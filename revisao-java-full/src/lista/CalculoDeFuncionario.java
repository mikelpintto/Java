package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoDeFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.println("How many employees will be registered ?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");

			System.out.print("Entre com o ID: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			} 
			System.out.print("Entre com o nome: ");
			sc.nextLine();
			 String name = sc.nextLine();
			System.out.println("Entre com o salario: ");
			double salary = sc.nextDouble();
			 
			list.add(new Funcionario(id, name, salary));
			
		}
		
		

		sc.close();

	}

	public static boolean hasId(List<Funcionario> list, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

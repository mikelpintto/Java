package estruturaDados;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, numeroHorasTrabalhadas;
		
		double valorQueRecebePorHora, salarioDoFuncionario;
		
		numeroFuncionario = sc.nextInt();
		numeroHorasTrabalhadas = sc.nextInt();
		valorQueRecebePorHora = sc.nextDouble();
		
		salarioDoFuncionario = numeroHorasTrabalhadas * valorQueRecebePorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioDoFuncionario);
		
		sc.close();
		

	}

}

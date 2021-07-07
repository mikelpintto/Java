package banco;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		// entrando com os dados da conta
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicialDeposito = sc.nextDouble();
			conta = new Conta(numeroConta, titular, inicialDeposito);
		} else {
			conta = new Conta(numeroConta, titular);
		}
		// imprimindo a conta
		System.out.println(conta);

		// deposita na conta um valor
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		conta.deposita(valorDeposito);
		System.out.println("Update account data: ");
		// imprime a conta novamente apos operação acima
		System.out.println(conta);

		// realiza um saque na conta
		System.out.println();
		System.out.print("Enter a withdrw value: ");
		double valor = sc.nextDouble();
		conta.saca(valor);
		System.out.println("Update account data: ");
		// imprime a conta apos a operação acima
		System.out.println(conta);

		// fecha o scanner acima
		sc.close();

	}

}

import java.util.Scanner;

public class EstruturaCondicional05 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o codigo do item");
		int codigoItem = sc.nextInt();
		System.out.println("Escreva a quantidade deste item");
		int quantidadeItem = sc.nextInt();
		double conta;
		if(codigoItem == 1) {
		    conta = quantidadeItem * 4.00;
		    System.out.printf("Total: %.2f%n", conta);
		}else if(codigoItem == 2) {
				conta = quantidadeItem * 4.50;
				System.out.printf("Total: %.2f%n", conta);
		}else if(codigoItem == 3) {
			conta = quantidadeItem * 5.00;
			System.out.printf("Total: %.2f%n", conta);
		} else if (codigoItem == 4) {
			conta = quantidadeItem * 2.00;
			System.out.printf("Total: %.2f%n", conta);
		}else if (codigoItem == 5) {
			conta = quantidadeItem * 1.50;
			System.out.printf("Total: %.2f%n", conta);
		}
		
		sc.close();
	}
	
}

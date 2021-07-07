package util;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double cotacaoDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double comprarDollar = sc.nextDouble();
		CurrencyConverter.conversaoDollar(comprarDollar, cotacaoDollar);
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.valorReais);
		
		sc.close();

	}

}

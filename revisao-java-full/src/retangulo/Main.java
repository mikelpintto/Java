package retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com o valor da altura e largura: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();

		System.out.println("Area = " + retangulo.area());
		System.out.println("Perimetro = " + retangulo.perimetro());
		System.out.println("Diagonal = " + retangulo.diagonal());
		
		sc.close();

	}

}

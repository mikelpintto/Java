package estruturaDados;
import java.util.Scanner;

public class EstruturaRepetitiva {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int numero = sc.nextInt();
		
		int soma = 0;
		
		for(int i =0; i<numero; i++) {
			int x = sc.nextInt();
			soma +=x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}

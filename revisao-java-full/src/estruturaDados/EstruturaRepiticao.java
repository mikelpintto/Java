package estruturaDados;
import java.util.Scanner;

public class EstruturaRepiticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enntre com os numeros na seguinte ordem 5,2,4 e 0: ");
		int numeros = sc.nextInt();
		int soma = 0;
		while (numeros != 0) {
			soma += numeros;
			numeros = sc.nextInt();
			
		}
		System.out.println(soma);
		sc.close();

	}

}

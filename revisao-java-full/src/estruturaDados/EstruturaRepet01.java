package estruturaDados;
import java.util.Scanner;

public class EstruturaRepet01 {

	public static void main(String[] args) {
		 Scanner  sc = new Scanner(System.in);
		 
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i<numero; i++) {
			
			if( i % 2 != 0) {
				
				System.out.println(i);
				
			} 
		}
		 
		 sc.close();	
			
		

	}

}

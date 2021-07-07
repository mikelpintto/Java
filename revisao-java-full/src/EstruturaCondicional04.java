import java.util.Scanner;

public class EstruturaCondicional04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque a hora inicial do jogo");
		int horaInicial = sc.nextInt();
		System.out.println("Coloque a hora final do jogo");
		int horaFinal = sc.nextInt();
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		if(horaInicial > 1 )
		sc.close();
	}

}

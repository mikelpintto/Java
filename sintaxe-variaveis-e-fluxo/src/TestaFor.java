
public class TestaFor {

	public static void main(String[] args) {

		int somador = 0;

		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}

		for (int contador = 0; contador <= 10; contador++) {
			somador += contador;
		}
		System.out.println(somador);
	}

}


public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 19;
		boolean acompanhado = true;

		System.out.println("valor de acompanhando = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}

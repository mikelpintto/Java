
public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new Conta(1234, 567822);

		System.out.println("O numero da minha agencia �: " + conta.getAgencia());

		Conta conta2 = new Conta(1234, 567822);

		System.out.println("O numero da minha agencia �: " + conta2.getAgencia());

		Conta conta3 = new Conta(1234, 567822);

		System.out.println("O numero da minha agencia �: " + conta3.getAgencia());
		
		System.out.println(Conta.getTotal());

	}

}

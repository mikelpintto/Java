
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();

		// metodo deposita

		conta.saldo = 100;
		conta.deposita(50);

		System.out.println("O valor depositado é: " + conta.saldo);

		// metodo saca

		boolean conseguiuRetirar = conta.saca(51);

		System.out.println("O valor do saldo atual é : " + conta.saldo);
		System.out.println(conseguiuRetirar);

		// metodo transfere
		
		Conta contaDoMikel = new Conta();
		
		contaDoMikel.deposita(2000);
		
		if(contaDoMikel.transfere(300, conta)) {
			System.out.println("transferencia com sucesso!");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDoMikel.saldo);
		System.out.println(conta.saldo);
		
		contaDoMikel.titular="Mikel de paula";
		
		System.out.println(contaDoMikel.titular);

	}

}

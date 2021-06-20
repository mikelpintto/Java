
public class TestaBanco {

	public static void main(String[] args) {
		
		
		Cliente mikel = new Cliente();
		
		mikel.nome = "Mikel Pinto";
		mikel.cpf = "222.222.222-22";
		mikel.profissao = "desenvolvedor";
		
		Conta contaDoMikel = new Conta();
		contaDoMikel.deposita(100);
		
		contaDoMikel.titular = mikel;
		
		System.out.println(contaDoMikel.titular.nome);
		System.out.println(contaDoMikel.getSaldo());
		
		Conta carlos = new Conta();
		
		carlos.deposita(1000);
		
		System.out.println(carlos.getSaldo());
		
		carlos.titular = new Cliente();
		
		carlos.titular.nome = "Carlos Andrade Souza";
		
		System.out.println(carlos.titular.nome);

	}

}

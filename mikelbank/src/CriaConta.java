
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo=200;
		
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		
		primeiraConta.saldo +=100;
		
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = primeiraConta.saldo;
		
		System.out.println("Saldo da segunda conta �: " + segundaConta.saldo);
		
		if(primeiraConta==segundaConta) {
	         System.out.println("True");
		}else {
			System.out.println("S�o contas diferentes!");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}

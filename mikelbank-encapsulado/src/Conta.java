
public class Conta {

	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia) {
		
		total++;
		//System.out.println("O total de contas �: " + total);
		
		this.numero = numero;
		this.agencia = agencia;
		
		//System.out.println("O numero dessa conta �: " + this.numero);
		
		
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {

			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
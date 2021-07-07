package banco;

public class Conta {

	private int numeroConta;
	private String titular;
	private double valorDeposito;
	private double saldo;
	private final double taxa = 5.0;
	
	public Conta(int numeroConta, String titular, double inicialDeposito) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposita(inicialDeposito);
	}

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorDeposito) {

		this.saldo += valorDeposito;
	}

	public void saca(double valor) {

		this.saldo -= saldo - valor + taxa;
	
	}
	
	public String toString() {
		
		return "Numero da Conta: "
		+ getNumeroConta()
		+ ", Titular: " 
		+ getTitular() 
		+ ", Total: $ "
		+ String.format("%.2f", getSaldo());		
		
	}

}

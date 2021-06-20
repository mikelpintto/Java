
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 52369);
		
		System.out.println(conta.getNumero());
		
		Cliente mikel = new Cliente();
		
		mikel.setNome("Mikel Pinto");
		
		conta.setTitular(mikel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(conta); 
        System.out.println(mikel);
        System.out.println(conta.getTitular());
		
	}

}

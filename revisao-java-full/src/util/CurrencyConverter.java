package util;

public  class CurrencyConverter {
	
	public static double cotacaoDollar;
	
	public static double comprarDollar;
	
	public static double valorReais;
	
	public static void conversaoDollar( double comprarDollar, double cotacaoDollar ) {
		
		valorReais = (cotacaoDollar * comprarDollar) * 6.00 / 100.00 + (cotacaoDollar * comprarDollar); 
		
	}
	
	

}

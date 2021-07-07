package datahora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHora {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = data1.parse("25/06/2021");
		Date y2 = data2.parse("25/06/2021 15:42:07");
		
		System.out.println("x1: " + data2.format(x1));
		System.out.println("y1: " + data2.format(y1));
		System.out.println("y2: " + data2.format(y2));
		
		

	}

}

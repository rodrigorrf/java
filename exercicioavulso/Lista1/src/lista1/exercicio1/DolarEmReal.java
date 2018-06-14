package lista1.exercicio1;

import java.util.Scanner;

public class DolarEmReal {

	public static void main(String[] args) {
		double dolar = 0;
		double valor = 0;
		double real=2.50;
		
		Scanner ent = new Scanner(System.in);
		dolar = ent.nextDouble();
		valor = dolar * real;
		
		System.out.println("valor" + valor);
		ent.close();
	}

}

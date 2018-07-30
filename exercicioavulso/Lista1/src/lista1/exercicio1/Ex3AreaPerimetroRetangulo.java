package lista1.exercicio1;

import java.util.Scanner;

public class Ex3AreaPerimetroRetangulo {
	public static void main (String [] args) {
		float area;
		float comprimento;
		float largura;
		float perimetro;
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Comprimento");
		comprimento = input.nextFloat();
		
		System.out.println("Largura");
		largura = input.nextFloat();
		
		area = comprimento * largura;
		perimetro = 2 * comprimento + 2 * largura;
		
		System.out.println("Area: " + area + " cm²");
		System.out.println("Perimetro: " + perimetro + " cm²");
		input.close();
	}

}

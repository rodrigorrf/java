package lista1.exercicio1;

import java.util.Scanner;

public class Ex6Imposto {

	public static void main(String[] args) {
		Exe6ImpostoClass imposto = new Exe6ImpostoClass();
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Digite a área total do terreno:");
		imposto.setAreaTotal(inp.nextDouble());
		System.out.println("Digite o total construido:");
		imposto.setAreaConstruida(inp.nextDouble());
		
		
		//imposto = ((areaTotal - areaContruida) * 3.80) + (areaContruida * 5.00); 
		
		System.out.println("Total de imposto a ser cobrado: " + imposto.calculaImposto());
	}

}

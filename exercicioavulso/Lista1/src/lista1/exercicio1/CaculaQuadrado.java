package lista1.exercicio1;

import java.util.Scanner;

public class CaculaQuadrado {

	public static void main(String[] args) {
		double area = 0;
		double base = 0;
		double altura = 0;
		double areaPiso = 0;
		double bPiso = 0;
		double aPiso = 0;
		double total = 0;
		double total10 = 0;
		int opcao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digita a 1 metragem total ou 2 metragem fracionada");
		opcao = input.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite a area total: " + area);
			area = input.nextDouble();
		}
		else {
			System.out.println("Digite a base: " + base);
			base = input.nextDouble();
			System.out.println("Digite a altura: " + altura);
			altura = input.nextDouble();
			area = base * altura ;
		}
		
		System.out.println("Digite a base do Piso: " + bPiso);
		bPiso = input.nextDouble();
		bPiso = bPiso * 0.01;
		System.out.println("Digite a altura do Piso: " + aPiso);
		aPiso = input.nextDouble();
		aPiso = aPiso * 0.01;
		
		areaPiso = bPiso * aPiso;
		
		total = area / areaPiso;
		total10 = (total * 0.1) + total;
		
		System.out.println("Metragem total: " + area);
		System.out.printf("Total de piso a serem utilizados: %.0f" , total10);
		
		input.close();
		
		/*bPiso = 45 * 0.01;
		aPiso = 45 * 0.01;
		areaPiso = bPiso * aPiso;
		
		System.out.println("Metragem do ambiente: " + area);
		System.out.println("Metragem do piso: " + areaPiso);
		
		total = area / areaPiso;
		total10 = (total * 0.1) + total;
		
		System.out.printf("Total de Pisos que serão utilizados: %.0f" , total10);	*/		
	}

}

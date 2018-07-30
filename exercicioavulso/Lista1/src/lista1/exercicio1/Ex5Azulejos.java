package lista1.exercicio1;

import java.util.Scanner;

public class Ex5Azulejos {

	public static void main(String[] args) {
		float hp=0; //altura da parede
		float lp=0; //largura da parede
		float ha=0; //altura do azulejo
		float la=0; //largura do azulejo
		float total=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite altura da perede em cm");
		hp = input.nextFloat();
		
		System.out.println("Digite largura da parede em cm");
		lp = input.nextFloat();
		
		hp *= lp;
		
		System.out.println("Digite altura do azulejo em cm");
		ha = input.nextFloat();
		
		System.out.println("Digite largura do azulejo em cm");
		la = input.nextFloat();
		
		ha *= la;
		
		total = hp / ha;
		
		System.out.printf("Usar na parede de tamanho %.1f cm², %.0f de azulejos", hp,total);
		
		
		input.close();
		
	}

}

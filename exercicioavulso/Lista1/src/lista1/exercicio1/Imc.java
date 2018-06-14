package lista1.exercicio1;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		float altura;
		float peso;
		float imc;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o altura:");
		altura = input.nextFloat();
		System.out.println("Digite o peso:");
		peso = input.nextFloat();
		
		imc = peso / (altura * altura);
		
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: " + imc);
		
		if(imc <= 18.5)
			System.out.println("Abaixo do peso");
		else if(imc > 18 && imc <= 25)
			System.out.println("Pseo normal");
		else if(imc > 25 && imc <= 30)
			System.out.println("Acima do peso normal");
		else
			System.out.println("Obesidade");
		
		input.close();
	}

}
/*? IMC <= 18,5: Abaixo do peso normal
? 18,5 < IMC <= 25: Peso Normal
? 25 < IMC <= 30: Acima do peso normal.
? IMC > 30: Obesidade*/
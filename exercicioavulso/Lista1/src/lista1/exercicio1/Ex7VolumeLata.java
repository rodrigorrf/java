package lista1.exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex7VolumeLata {

	public static void main(String[] args) {
        Ex7VolumeLataClass lata = new Ex7VolumeLataClass();
        Scanner inp = new Scanner(System.in);
        	
		System.out.println("Digite o raio:");
		lata.raio = inp.nextDouble();
		System.out.println("Digite a altura:");
		lata.altura = inp.nextDouble();
			
		System.out.println("Volume total da lata: " + lata.volumeTotal());
	}

}

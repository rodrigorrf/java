package lista1.exercicio1;

import java.util.Scanner;

public class Ex4MediaBimestral {
	public static void main(String [] args) {
		float [] nota = new float [4];
		float media=0;
		
		System.out.println("Digite as médias");
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < nota.length; i ++) {
			nota[i] = in.nextFloat();
			media += nota[i];
		}
		media = media / 4;
		System.out.println(media);
	}

}

package lista1.exercicio1;

import java.util.Scanner;

public class MediaBimestral {
	public static void main(String [] args) {
		float [] nota = new float [4];
		float media=0;
		

		
		for(int i = 0; i < nota.length; i ++) {
			media += nota[i];
		}
		
		System.out.println(media);
	}

}

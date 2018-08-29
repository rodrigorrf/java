package lista1.exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7VolumeLataClass {
	double raio;
	double altura;
	double volume;
	String total;
	static double pi = 3.14159;
	
	DecimalFormat casaDecimal = new DecimalFormat("0.00");
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String volumeTotal() {
		this.volume = this.pi * this.raio * this.raio * this.altura;
		this.total = casaDecimal.format(volume);
		
		return this.total;
	}

}

package lista1.exercicio1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex8FahrenheitEmCelsiusClass {
	private float celsius;
	private float fahre;
	private String temp;
	
	DecimalFormat dec = new DecimalFormat("0.00");
	
	public float getCelsius() {
		return celsius;
	}
	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}
	public  float getFahre(){
		return fahre;
	}
	public void setFahre(float fahre) {
		this.fahre = fahre;
	}
	
	public void convertTemp() {
		this.celsius = (this.fahre - 32) * 5 / 9;
		this.temp = dec.format(this.celsius);
		JOptionPane.showMessageDialog(null, "Resultado da conversão para Celsius: " + temp);
	}
}

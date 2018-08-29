package lista1.exercicio1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex8FahrenheitEmCelsius {

	public static void main(String[] args) {
        String temp;
        float temperatura;
		Ex8FahrenheitEmCelsiusClass fahre = new Ex8FahrenheitEmCelsiusClass();
		
		temperatura = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit"));
		fahre.setFahre(temperatura);
		fahre.convertTemp();
	}

}

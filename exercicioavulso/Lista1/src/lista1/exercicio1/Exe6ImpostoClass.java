package lista1.exercicio1;

public class Exe6ImpostoClass {
	private static double impConstruido;
	private static double impNaoConstruido;
	private double areaTotal;
	private double areaConstruida;
	
	
	
	public static double getImpConstruido() {
		return impConstruido;
	}


	public static void setImpConstruido(double impConstruido) {
		Exe6ImpostoClass.impConstruido = impConstruido;
	}



	public static double getImpNaoConstruido() {
		return impNaoConstruido;
	}



	public static void setImpNaoConstruido(double impNaoConstruido) {
		Exe6ImpostoClass.impNaoConstruido = impNaoConstruido;
	}



	public double getAreaTotal() {
		return areaTotal;
	}



	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}



	public double getAreaConstruida() {
		return areaConstruida;
	}



	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}



	public double calculaImposto() {
		double imposto;
		
		imposto = ((this.areaTotal - this.areaConstruida) * this.impNaoConstruido) + (this.areaConstruida  * this.impConstruido);
		return imposto;
	}

}

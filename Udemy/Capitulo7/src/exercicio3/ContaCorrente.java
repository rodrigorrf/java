package exercicio3;

public class ContaCorrente extends Conta{
	
	public double getSaldo() {
		this.saldo -= 0.10;
		return this.saldo;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			this.saldo -= 0.10;
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		this.saldo -= 0.10;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			this.saldo -= 0.10;
			contaDestino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	

}

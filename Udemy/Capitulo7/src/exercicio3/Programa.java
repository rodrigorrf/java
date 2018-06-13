package exercicio3;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		cliente.setCpf("123456789-00");
		
		ContaCorrente corrente = new ContaCorrente();		
		corrente.numeroConta = 123;
		corrente.titular = cliente;
		corrente.depositar(1000);
		corrente.sacar(200);
		System.out.println(corrente.getSaldo());
		//corrente.imprime();

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ferreira");
		cliente2.setCpf("123456789-11");
		
		ContaPoupança cp = new ContaPoupança();
		cp.numeroConta = 321;
		cp.titular = cliente2;
		cp.depositar(1000);
		
		cp.imprime();
		

	}

}

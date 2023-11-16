package questao01;

public class ContaBancaria {
	private double saldo;
	private ManipuladorSaldo manipuladorSaldo;
	
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
		this.manipuladorSaldo = new ManipuladorSaldo(saldoInicial);
	}
	
	public void depositar(double valor) {
		this.saldo = this.manipuladorSaldo.depositar(valor);
	}
	
	public void sacar(double valor) { 
		this.saldo = this.manipuladorSaldo.sacar(valor);
	}
}

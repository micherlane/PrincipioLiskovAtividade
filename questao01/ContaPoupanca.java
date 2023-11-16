package questao01;

public class ContaPoupanca {
	private double saldo;
	private ManipuladorSaldo manipuladorSaldo;
	
	public ContaPoupanca(double saldoInicial) {
		this.saldo = saldoInicial;
		this.manipuladorSaldo = new ManipuladorSaldo(saldoInicial);
	}
	
	public void sacar(double valor) {
		if (valor > 1000) {
			throw new RuntimeException("Não pode sacar mais de 1000 em uma poupança");	
		}
		
		this.saldo = this.manipuladorSaldo.sacar(valor);
		
	}
}
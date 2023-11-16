package questao01;

public class ManipuladorSaldo {
	private double saldo;
	
	ManipuladorSaldo(double saldoInicial){
		this.saldo = saldoInicial;
	}
	
	public double sacar(double valor) {
		return saldo -= valor; 
	}
	

	public double depositar(double valor) {
		return saldo += valor;
	}
}

package questao02;


public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private Conta conta;
	
	public Cliente(String nome, String cpf, String endereco, Conta conta) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.conta = conta;
	}
}

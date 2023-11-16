package questao05;

public class Reacao implements Publicavel{
	private Perfil autor;
	
	private String tipoReacao;
	public Reacao(Perfil autor, String tipoReacao) {
		this.autor = autor;
		this.tipoReacao = tipoReacao;
	}

	public void exibir() {
		System.out.println("Reação [" + tipoReacao);
	}

	@Override
	public Perfil getAutor() {
		return this.autor;
	}
}

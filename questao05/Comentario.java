package questao05;

public class Comentario {
	private Perfil autor;
	private String conteudo;
	
	public Comentario(Perfil autor, String conteudo) {
		this.conteudo = conteudo;
		this.autor = autor;
	}

	public void exibir() {
		System.out.println("Comentário: " + this.conteudo);
	}
	
	
}

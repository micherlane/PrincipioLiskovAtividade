package questao05;

import java.util.ArrayList;
import java.util.List;

public class Postagem implements Publicavel{
	private String id;
	private Perfil autor;
	private String conteudo;
	private List<Reacao> reacoes = new ArrayList<Reacao>();
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	
	public Postagem(String id, Perfil autor, String conteudo) {
		this.id = id;
		this.autor = autor;
		this.conteudo = conteudo;
	}
	
	public void exibir() {
		System.out.println("Postagem [" + id + "] de " + autor.getNomeUsuario() +	": " + conteudo);
	}

	@Override
	public Perfil getAutor() {
		return this.autor;
	}
}

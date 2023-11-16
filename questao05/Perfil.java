package questao05;

public class Perfil {
	private int id;
	private String nomeUsuario;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getId() {
		return id;
	}

	public Perfil(int id, String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.id = id;
	}
}

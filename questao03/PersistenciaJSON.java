package questao03;

import java.io.IOException;

public class PersistenciaJSON {
	private Persistencia persistencia;
	
	public PersistenciaJSON() {
		this.persistencia = new Persistencia();
	}
	
	public void salvar(String dados, String arquivo) throws IOException{
		if (!dados.startsWith("{")) {
			throw new IllegalArgumentException("Dados não estão em formato JSON.");
		}
		
		this.persistencia.salvar(dados, arquivo);
	}
}

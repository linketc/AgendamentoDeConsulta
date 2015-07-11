
public class Especialidade {
	private static int id;
	int cod;
	String nome;
	
	public Especialidade (String nome){
		this.nome = nome;
		id += 1; 
		int cod = id;
	}

	public int getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

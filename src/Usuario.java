
abstract public class Usuario {
	private static int id;
	private int cpf, cod, tipo;
	private String nome;
	
	// construtor
	public Usuario (int cod, int cpf, String nome, int tipo){
		id += 1; // sempre adiciona 1 na id
		this.cod = cod;
		this.cpf = cpf;
		this.nome = nome;
		this.tipo = tipo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCod() {
		return cod;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
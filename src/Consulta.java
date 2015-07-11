import java.sql.Date;


public class Consulta {
	private int id_cliente, id_medico, id_especialidade;
	private Date data;
	private boolean aprovado;
	private boolean presente;
	
	// construtor
	private Consulta (int cliente, int medico, int especialidade, Date data){
		this.id_cliente = cliente;
		this.id_medico = medico;
		this.id_especialidade = especialidade;
		this.data = data; 
	}// fim do construtor
	
}

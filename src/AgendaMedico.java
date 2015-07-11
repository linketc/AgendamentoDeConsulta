import java.sql.Date;
import java.sql.Time;


public class AgendaMedico {
	private int id_medico, id_especialidade, vagas;
	private Date data;
	private Time hora;
	
	// construtor
	public AgendaMedico (int medico, int especialidade, int vagas){
		this.id_medico = medico;
		this.id_especialidade = especialidade;
		this.vagas = vagas;
	}// fim construtor
	
	
}

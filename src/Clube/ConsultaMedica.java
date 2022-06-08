package Clube;

public class ConsultaMedica extends AssistenciaPessoal {
	
	private String Especialidade;
	
	private boolean AlterarData = true;

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.Especialidade = especialidade;
	}

	public ConsultaMedica() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package Clube;

public class AssistenciaVeicular extends Servico {
	
	private String matricula;
	
	private String Descricao;
	
	private boolean AlterarData = true;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public AssistenciaVeicular() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

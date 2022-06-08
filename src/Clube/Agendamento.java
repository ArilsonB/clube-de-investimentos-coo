package Clube;

import java.util.Date;

public class Agendamento {
	
	private Socio socio;
	
	private Servico servico;
	
	private Date data;

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void agendar() {
		// TODO Auto-generated method stub
		
	}
	
	public void alterarData(Date data) {
		//if(this.servico.alterarData == true) {
			this.data = data;
		//}
	}

}

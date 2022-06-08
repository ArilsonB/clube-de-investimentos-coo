package Clube;

import java.util.Date;

public class RenovacaoDeDocumento extends AssistenciaPessoal {
	
	private String TipoDocumento;
	private Date DataValidade;
	private boolean AlterarData = false;

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public Date getDataValidade() {
		return DataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		DataValidade = dataValidade;
	}

	public RenovacaoDeDocumento() {
		super();
		// TODO Auto-generated constructor stub
	}


}

package Clube;

import java.util.Date;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("|||||== CLUBE DE INVESTIMENTOS ==|||||");
		
		Socio socio = new Socio();
		socio.setNumeroSocio(1);
		socio.setNomeSocio("Arilson");
		
		Servico servico = new ConsultaMedica();
		servico.setNumeroServico(1);
		((AssistenciaPessoal) servico).setNomePessoaAssistida("Maria");
		((ConsultaMedica) servico).setEspecialidade("Ortopedia");
		
		Agendamento agendamento = new Agendamento();
		agendamento.setSocio(socio);
		agendamento.setServico(servico);
		agendamento.setData(new Date("21/02/2023"));
		agendamento.agendar();

	}

}

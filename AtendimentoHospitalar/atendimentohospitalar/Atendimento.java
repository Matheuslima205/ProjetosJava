package atendimentohospitalar;

import java.util.Scanner;

public class Atendimento extends Main{
	//ADICIONAR DATA DO ATENDIMENTO
	Scanner teclado = new Scanner(System.in);
	
	public void iniciarAtendimento(Paciente paciente) {
		String nome, sexo, cpf;
		
		System.out.println("DADOS DO PACIENTE\n");
		System.out.println("NOME: ");
		nome = teclado.nextLine();
		System.out.println("SEXO: ");
		sexo = teclado.nextLine();
		System.out.println("CPF: ");
		cpf = teclado.nextLine();
		
		paciente.setNome(nome);
		paciente.setSexo(sexo);
		paciente.setCpf(cpf);
		
		System.out.println("\nDIRECIONAR PACIENTE A TRIAGEM ->\n");
	}
	
	public void iniciarAcolhimento(TecEnfermagem tecEnfermagem, Enfermeiro enfermeiro, Paciente paciente) {
		tecEnfermagem.acolhimento(paciente);
		enfermeiro.acolhimento(paciente);
		enfermeiro.registrarAtendimento(paciente);
	}
	
	public void iniciarConsulta(Medico medico, Paciente paciente, TecEnfermagem tecEnfermagem) {
		medico.diagnosticarPaciente(paciente);
		medico.prescreverTratamento(paciente, tecEnfermagem);
		medico.registrarAtendimento(paciente);
	}
	
	public void emitirLaudo(Paciente paciente, Medico medico) {
		System.out.println("EMITIR O LAUDO DO PACIENTE? (S/N)");
		String resposta = teclado.nextLine();
		if (resposta.toUpperCase().trim().equals("S")) {
			paciente.emitirLaudo(medico);
			System.out.println("TCHAU, BOA SAÚDE!");
		} else {
			System.out.println("TCHAU, BOA SAÚDE!");
		}
	}
}

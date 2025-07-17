package atendimentohospitalar;

import java.util.Scanner;

public class Medico extends Funcionario{
	private String crm;
	private String especialidade;
	
	
	Scanner teclado = new Scanner(System.in);
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	public void diagnosticarPaciente(Paciente paciente) {
		System.out.println("PARÂMETROS DE AVALIAÇÃO");
		System.out.println("__________________________________________________________________________________________________________________________");
		
		System.out.println("TEMPERATURA: " + paciente.getTemperatura());
		System.out.println("FRÊQUENCIA CARDIACA: " + paciente.getFrequenciaCardiaca());
		System.out.println("PRESSÃO ARTERIAL: " + paciente.getPressaoArterial());
		
		System.out.println("ALERGIAS:");
		if (paciente.getAlergias().isEmpty()) {
			System.out.println("Nenhuma Alergia Registrada");
		}else {
			for (String alergia : paciente.getAlergias()) {
				System.out.println("- " + alergia);
			}
		}
			
		System.out.println("SINTOMAS: ");
		if (paciente.getSintomas().isEmpty()) {
			System.out.println("Nenhum Sintoma Registrado");
		}else {
			for (String sintoma : paciente.getSintomas()) {
				System.out.println("- " + sintoma);
			}
		}
		System.out.println("CLASSIFICAÇÃO DE RISCO: " + paciente.getEstado());
		
		System.out.println("ALTERAR CLASSIFICAÇÃO DE RISCO? (S/N)");
		String respostaUm = teclado.nextLine();
		if (respostaUm.toUpperCase().trim().equals("S")) {
			System.out.println("CLASSIFICAÇÃO DE RISCO:");
			System.out.println("1- NÃO URGENTE");
			System.out.println("2- POUCO URGENTE");
			System.out.println("3- URGENTE");
			System.out.println("4- MUITO URGENTE");
			System.out.println("5- EMERGÊNCIA");
			
			int classificacao = teclado.nextInt();
			
			switch (classificacao) {
				case 1: paciente.setEstado("Não Urgente");
						break;
				case 2: paciente.setEstado("Pouco Urgente");
						break;
				case 3: paciente.setEstado("Urgente");
						break;
				case 4: paciente.setEstado("Muito Urgente");
						break;
				case 5: paciente.setEstado("Emergência");
			}
			
			System.out.println("\nDIAGNÓSTICO: ");
			paciente.setDiagnostico(teclado.nextLine());
		}else {
			System.out.println("\nDIAGNÓSTICO: ");
			paciente.setDiagnostico(teclado.nextLine());
		}
	}
	
	public void prescreverTratamento(Paciente paciente, TecEnfermagem tecEnfermagem) {
		System.out.println("TRATAMENTO:");
		paciente.setMedicacao(teclado.nextLine());	
		
		System.out.println("MEDICAMENTO DE USO PARENTERAL? (S/N)");
		String respostaDois = teclado.nextLine();
		
		if (respostaDois.toUpperCase().trim().equals("S")) {
			System.out.println("ENCAMINHAR PACIENTE A ENFERMARIA");
			tecEnfermagem.aplicarTratamento(paciente);
		}else {
			System.out.println("INSTRUIR PACIENTE A RESPEITO DO TRATAMENTO");
		}
	}
}

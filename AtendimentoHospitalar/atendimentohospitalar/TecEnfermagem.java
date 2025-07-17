package atendimentohospitalar;

import java.util.Scanner;

public class TecEnfermagem extends Enfermeiro {
	Scanner teclado = new Scanner(System.in);
	
	@Override
	public void acolhimento(Paciente paciente) {
		System.out.println("FUNCÍONARIO: " + getNome() + " | COREN: " + 
				getCoren() + " | SETOR: " + getSetor() + " | CARGO: " + getCargo());
		System.out.println("\nPACIENTE : " + paciente.getNome() + " | CPF: " + paciente.getCpf());

		System.out.println("\n\nPARÂMETROS DE AVALIAÇÃO ");
		System.out.println("TEMPERATURA: ");
		paciente.setTemperatura(teclado.nextFloat());
		System.out.println("FREQUENCIA CARDIACA: ");
		paciente.setFrequenciaCardiaca(teclado.nextInt());
		String enter = teclado.nextLine();
		System.out.println("PRESSÃO ARTERIAL: ");
		paciente.setPressaoArterial(teclado.nextLine());
	}
	
	public void aplicarTratamento(Paciente paciente) {
		System.out.println("__________________________________________________________________________________________________________________________");
		System.out.println("APLICAR TRATAMENTO RECOMENDADO:");
		System.out.println("- " + paciente.getMedicacao());
		System.out.println("__________________________________________________________________________________________________________________________");
		}
}

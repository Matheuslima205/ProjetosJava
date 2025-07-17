package atendimentohospitalar;

public class Main {
	public static void main(String[] args) {
		Atendimento atendimento = new Atendimento();
		
		TecEnfermagem tecEnfermagem = new TecEnfermagem();
		tecEnfermagem.setNome("Marcos Almeida de Oliveira");
		tecEnfermagem.setCpf("123.456.789-01");
		tecEnfermagem.setCoren("123456-TE/SP");
		tecEnfermagem.setCargo("Técnico de Enfermagem 1");
		tecEnfermagem.setSetor("Acolhimento");
		
		Enfermeiro enfermeiro = new Enfermeiro();
		enfermeiro.setNome("Ariel Ferreira Cunha");
		enfermeiro.setCpf("987.654.321.01");
		enfermeiro.setCoren("654321-ENF/SP");
		enfermeiro.setCargo("Enfermeiro Chefe");
		enfermeiro.setSetor("Acolhimento");
		
		Medico medico = new Medico();
		medico.setNome("Laura Fibonacci Cunha");
		medico.setCrm("456789-CRM/SP");
		medico.setCpf("444.555.666-01");
		medico.setCargo("Médico Especialista");
		medico.setEspecialidade("Clínico Geral");
		
		Paciente paciente = new Paciente();
		
	
		System.out.println("==========================================================================================================================");
		System.out.println("ATENDIMENTO HOSPITALAR"); //CENTRALIZAR
		System.out.println("__________________________________________________________________________________________________________________________\n");
		atendimento.iniciarAtendimento(paciente);
		
		System.out.println("==========================================================================================================================");
		System.out.println("TRIAGEM ->");
		System.out.println("==========================================================================================================================\n");
		atendimento.iniciarAcolhimento(tecEnfermagem, enfermeiro, paciente);
		
		System.out.println("\n==========================================================================================================================");
		System.out.println("CONSULTA ->");
		System.out.println("==========================================================================================================================\n");
		atendimento.iniciarConsulta(medico, paciente, tecEnfermagem);
		
		System.out.println("\n==========================================================================================================================");
		System.out.println("EMISSÃO DO LAUDO ->");
		System.out.println("==========================================================================================================================\n");
		atendimento.emitirLaudo(paciente, medico);
	}
}

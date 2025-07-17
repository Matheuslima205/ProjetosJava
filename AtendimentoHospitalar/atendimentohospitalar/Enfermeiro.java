package atendimentohospitalar;

import java.util.Scanner;

public class Enfermeiro extends Funcionario {
	private String coren;
	private String setor;
	
	
	Scanner teclado = new Scanner(System.in);
	
	
	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}


	public void acolhimento(Paciente paciente) {
		System.out.println("POSSUI ALERGIAS? (S/N)");
		String respostaUm = teclado.nextLine();
		
		if (respostaUm.toUpperCase().trim().equals("S")) {
			while (true){
				System.out.println("ADICIONAR ALERGIA: ");
				String alergia = teclado.nextLine();
				paciente.getAlergias().add(alergia);
				
				System.out.println("ADICIONAR NOVA ALERGIA? (S/N)");
				String respostaDois = teclado.nextLine();
				
				if (respostaDois.toUpperCase().trim().equals("N")) {
					break;
				}
			}
		}
		
		
		System.out.println("POSSUI SINTOMAS? (S/N)");
		String respostaTres = teclado.nextLine();
		
		if (respostaTres.toUpperCase().trim().equals("S")) {
			while (true){
				System.out.println("ADICIONAR SINTOMA: ");
				String sintoma = teclado.nextLine();
				paciente.getSintomas().add(sintoma);
				
				System.out.println("ADICIONAR NOVO SINTOMA? (S/N)");
				String respostaQuatro = teclado.nextLine();
				
				if (respostaQuatro.toUpperCase().trim().equals("N")) {
					break;
				}
			}
		}
		avaliacaoClinica(paciente);
	}
	
	public void avaliacaoClinica(Paciente paciente) {
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
		
		System.out.println("FUNCÍONARIO: " + getNome() + " | COREN: " + 
						getCoren() + " | SETOR: " + getSetor() + " | CARGO: " + getCargo() + "\n");
	}
}

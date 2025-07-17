package atendimentohospitalar;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
	private String pressaoArterial;
	private float temperatura;
	private int frequenciaCardiaca;
	private List<String> alergias;
	private List<String> sintomas;
	private String medicacao;
	private String estado;
	private String diagnostico;
	
	public Paciente() {
		this.alergias = new ArrayList<>();
		this.sintomas = new ArrayList<>();
	}
	
	
	public String getPressaoArterial() {
		return pressaoArterial;
	}
	
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public int getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}
	
	public void setFrequenciaCardiaca(int frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}
	
	public List<String> getAlergias() {
		return alergias;
	}
	
	public void setAlergias(List<String> alergias) {
		this.alergias = alergias;
	}
	
	public List<String> getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(List<String> sintomas) {
		this.sintomas = sintomas;
	}
	
	public String getMedicacao() {
		return medicacao;
	}
	
	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public void emitirLaudo(Medico medico) {
		System.out.println("__________________________________________________________________________________________________________________________");
		System.out.println("HOSPITAL DA VIDA");
		System.out.println("__________________________________________________________________________________________________________________________\n");
		
		System.out.println("LAUDO DE CONSULTA MÉDICA");
		System.out.println("__________________________________________________________________________________________________________________________\n");
		
		System.out.println("NOME: " + getNome());
		System.out.println("SEXO: " + getSexo());
		System.out.println("CPF: " + getCpf());
		System.out.println("__________________________________________________________________________________________________________________________\n");
		
		System.out.println("CONCLUSÕES");
		System.out.println("__________________________________________________________________________________________________________________________\n");
		
		System.out.println("PARÂMETROS DE AVALIAÇÃO");
		System.out.println("-TEMPERATURA: " + getTemperatura());
		System.out.println("-FRÊQUENCIA CARDIACA: " + getFrequenciaCardiaca());
		System.out.println("-PRESSÃO ARTERIAL: " + getPressaoArterial());
		System.out.println("-ALERGIAS:");
		if (getAlergias().isEmpty()) {
			System.out.println("Nenhuma Alergia Registrada");
		}else {
			for (String alergia : getAlergias()) {
				System.out.println("	- " + alergia);
			}
		}
		System.out.println("-SINTOMAS: ");
		if (getSintomas().isEmpty()) {
			System.out.println("Nenhum Sintoma Registrado");
		}else {
			for (String sintoma : getSintomas()) {
				System.out.println("	- " + sintoma);
			}
		}
		
		System.out.println("\n\nDIAGNÓSTICO: " + getDiagnostico());
		System.out.println(" ");
		
		System.out.println("TRATAMENTO: " + getMedicacao());
		
		System.out.println("__________________________________________________________________________________________________________________________");
		System.out.println("Dr(a). " + medico.getNome() + " | CRM: " + medico.getCrm() + 
						" | ESPECIALIDADE: " + medico.getEspecialidade());
		System.out.println("__________________________________________________________________________________________________________________________\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

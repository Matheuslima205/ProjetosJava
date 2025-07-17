package atendimentohospitalar;

public abstract class Funcionario extends Pessoa {
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void registrarAtendimento(Paciente paciente) {
		System.out.println("\nAtendimento do paciente " + paciente.getNome() + " registrado com sucesso"  );
	}
}

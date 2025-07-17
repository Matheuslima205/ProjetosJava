package atendimentohospitalar;

//CLASSE ABSTRATA PARA CRIAÇÃO DAS CLASSES FILHAS (FUNCIONARIO E PACIENTE);
public abstract class Pessoa {
	private String nome;
	private String sexo;
	private String cpf;
	
	//ADICIONAR IDADE E SEXO
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}

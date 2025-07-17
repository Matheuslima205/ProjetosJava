package salario;

import java.util.ArrayList;

public abstract class Pessoa {
	private String nome;
	private long cpf;
	private ArrayList<Pessoa> ponto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	

	public ArrayList<Pessoa> getPonto() {
		return ponto;
	}

	public void setPonto(ArrayList<Pessoa> ponto) {
		this.ponto = ponto;
	}

	public abstract double calcularSalario(double salario);
}

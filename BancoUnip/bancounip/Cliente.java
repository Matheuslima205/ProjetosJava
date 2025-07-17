package bancounip;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String documento;
	private ArrayList<Cartao> cartoes;
	private Conta conta;
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public ArrayList<Cartao> getCartoes(){
		return cartoes;
	}
	
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta (Conta conta) {
		this.conta = conta;
	}
	
	
	public Cliente() {
		cartoes = new ArrayList<>();
	}
	
	
	
	public void depositar (double valor) {
		conta.depositar(valor);
	}
	
	public void sacar (double valor) {
		conta.sacar(valor);
	}
	
	public void transferir (double valor, Conta destino) {
		conta.transferir(valor, destino);
	}
	
	public void imprimirExtrato() {
		System.out.println("Nome Cliente: " + nome);
		System.out.println("Documento Cliente: " + documento);
		conta.imprimirExtrato();
	}
}

package bancounip;

public class Conta {
	private long numero;
	private double limite;
	private double saldo;
	private Agencia agencia;
	
	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		if (saldo > valor) {
			destino.depositar(valor);
			saldo -= valor;
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void imprimirExtrato() {
		System.out.println("EXTRATO BANCARIO");
		System.out.println("Saldo: " + saldo);
	}
}









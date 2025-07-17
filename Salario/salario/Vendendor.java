package salario;

public class Vendendor extends Pessoa {
	private double comissao;
	private long numeroVendas;
	
	@Override
	public double calcularSalario(double salario) {
		return (double)(salario + comissao * numeroVendas);
	}
}


package salario;

public class Gerente extends Pessoa {
	private double bonificacao;
	
	@Override
	public double calcularSalario(double salario) {
		return (double)(salario * 6 + bonificacao);
	}
}

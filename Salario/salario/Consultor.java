package salario;

public class Consultor extends Gerente {
	private double valorHora;
	private double horasTrabalhadas;
	
	public double consultarSalario() {
		return (double)(valorHora * horasTrabalhadas);
	}
}

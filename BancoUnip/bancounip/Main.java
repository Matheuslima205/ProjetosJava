package bancounip;

public class Main {
	public static void main(String [] agrs) {
		Agencia agencia = new Agencia();
		agencia.setNome("Agencia Brasil");
		agencia.setNumero(1234);
		
		Conta contaUm = new Conta();
		contaUm.setNumero(123456789);
		contaUm.setLimite(1200);
		contaUm.setSaldo(200);
		contaUm.setAgencia(agencia);
		
		Cliente clienteUm = new Cliente();
		clienteUm.setNome("Java Antonio Solza");
		clienteUm.setDocumento("12.123.123-1");
		clienteUm.setConta(contaUm);
		
		Cartao cartaoUm = new Cartao();
		cartaoUm.setNumero(1112223334);
		cartaoUm.setLimite(1200);
		clienteUm.getCartoes().add(cartaoUm);
		
	}
}

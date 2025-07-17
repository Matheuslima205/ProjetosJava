package cadastroempresa;

public class Main {
	public static void main(String[]args) {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Juliana Luz");
		pessoa.setCep("15980000");
		pessoa.setComplemento("Casa");
		pessoa.setCpf("444.555.666-01");
		pessoa.setEmail("julianaluz@gmail.com");
		pessoa.setTelefone("16993220535");
		pessoa.setLogradouro("Av. das flores");
		pessoa.setDataNasc("31/01/2000");
		
		PessoaJuridica empresa = new PessoaJuridica("Torradinhas", "111.222.333/0001-01",
				"torradinhassp@gmail.com", "16991223354", "15000-000", "Av. das Flores","Corredor 4");
	}
}

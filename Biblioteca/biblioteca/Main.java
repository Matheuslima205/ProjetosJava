package biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livroUm = new Livro();
		livroUm.setAno(2019);
		livroUm.setAutor("José da Cunha");
		livroUm.setDisponivel(true);
		livroUm.setEditora("Record");
		livroUm.setTitulo("Chovendo no molhado");
		biblioteca.adicionarLivro(livroUm);
		
		Livro livroDois = new Livro();
		livroDois.setAno(2015);
		livroDois.setAutor("Carla Pereira");
		livroDois.setDisponivel(true);
		livroDois.setEditora("Intrinseca");
		livroDois.setTitulo("A volta dos que não foram");
		biblioteca.adicionarLivro(livroDois);
		
		Usuario usuarioUm = new Usuario();
		usuarioUm.setNome("Carlos Manuel");
		usuarioUm.setDocumento("123.123.123-01");
		biblioteca.registrarUsuario(usuarioUm);
		
		usuarioUm.pegarEmprestado(usuarioUm, livroUm);
		usuarioUm.exibirLivrosEmprestados();
		biblioteca.exibirLivrosDisponiveis();
		usuarioUm.devolverLivro(usuarioUm, livroUm);
		biblioteca.exibirLivrosDisponiveis();
		
		
		
	}

}

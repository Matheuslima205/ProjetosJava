package biblioteca;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String documento;
	private ArrayList<Livro> livrosEmprestados;
	
	public Usuario() {
		this.livrosEmprestados = new ArrayList<>();
	}
	
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

	public ArrayList<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

	
	public void pegarEmprestado(Usuario usuario, Livro livro) {
		livro.emprestar(usuario, livro);
	}
	
	public void devolverLivro(Usuario usuario, Livro livro) {
		livro.devolver(usuario, livro);
		
	}
	
	public void exibirLivrosEmprestados() {
		System.out.println("LIVROS EMPRESTADOS");
		for (Livro livro : livrosEmprestados) {
			System.out.println(livro.getTitulo());
		}
	}
}

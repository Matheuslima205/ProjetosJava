package biblioteca;

public class Livro{
	private String titulo;
	private String autor;
	private int ano;
	private String editora;
	private boolean disponivel;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	public void emprestar(Usuario usuario, Livro livro) {
		if (livro.disponivel == true) {
			usuario.getLivrosEmprestados().add(livro);
			livro.disponivel = false;
		}
		else {
			System.out.println("Livro Indisponível");
		}
	}
	
	public void devolver(Usuario usuario, Livro livro) {
		usuario.getLivrosEmprestados().remove(livro);
		livro.disponivel = true;
	}
}

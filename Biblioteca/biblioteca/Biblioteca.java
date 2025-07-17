package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> listaLivros;
	private ArrayList<Usuario> listaUsuarios;
	
	
	public Biblioteca(){
		this.listaLivros = new ArrayList<>();
		this.listaUsuarios = new ArrayList<>();
	}
	
	
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}
	
	public void registrarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public void exibirLivrosDisponiveis() {
		System.out.println("LIVROS DISPONÍVEIS");
		for (Livro livro: listaLivros) {
			
			if (livro.getDisponivel() == true) {
				System.out.println(livro.getTitulo());
			}
		}
	}
}

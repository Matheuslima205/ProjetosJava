package cadastroempresa;

public class PessoaJuridica {
	private String razaoSocial;
	private String cnpj;
	private String email;
	private String telefone;
	private String cep;
	private String logradouro;
	private String complemento; 
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String razaoSocial, String cnpj, String email,
			String telefone, String cep, String logradouro, String complemento) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDataNasc() {
		return logradouro;
	}

	public void setDataNasc(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}

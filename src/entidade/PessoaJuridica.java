package entidade;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;


	/**
	 * @param nome
	 * @param email
	 * @param sobrenome
	 * @param cnpj
	 */
	public PessoaJuridica(String nome, String email, String sobrenome, String cnpj) {
		super(nome, email, sobrenome);
		this.cnpj = cnpj;
	}

	
	
	public PessoaJuridica(int iD, String nome, String email, String sobrenome, String cnpj) {
		super(iD, nome, email, sobrenome);
		this.cnpj = cnpj;
	}



	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getEmail()=" + getEmail() + ", isAtivo()=" + isAtivo()
				+ ", getSobrenome()=" + getSobrenome() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}
	
	

}

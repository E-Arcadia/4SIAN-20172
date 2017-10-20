package entidade;

public class PessoaFisica extends Pessoa {
	
	private String cfp;

	
	
	
	


	/**
	 * @param nome
	 * @param email
	 * @param sobrenome
	 */
	public PessoaFisica(String nome, String email, String sobrenome, String cpf) {
		super(nome, email, sobrenome);
		this.cfp = cpf;
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public String getCfp() {
		return cfp;
	}

	public void setCfp(String cfp) {
		this.cfp = cfp;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cfp=" + cfp + ", getEmail()=" + getEmail() + ", isAtivo()=" + isAtivo()
				+ ", getSobrenome()=" + getSobrenome() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}

	

	
	
	

}

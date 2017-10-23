package entidade;

//import java.util.Scanner;

public class Pessoa {
	private int ID;
	private String nome;
	private String email;
	private boolean ativo;
	private String sobrenome;
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome, String email, String sobrenome) {
		this.nome = nome;
		this.email = email;
		this.sobrenome = sobrenome;
		this.ativo = true;
	}
	
	
	public Pessoa(int iD, String nome, String email, String sobrenome) {
		super();
		ID = iD;
		this.nome = nome;
		this.email = email;
		this.sobrenome = sobrenome;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setNome(String s) {
		this.nome = s;
	}
	public String getNome() {
		return this.nome;
	}

	

	@Override
	public String toString() {
		return "Pessoa [ID=" + ID + ", nome=" + nome + ", email=" + email + ", ativo=" + ativo + ", sobrenome="
				+ sobrenome + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (ativo != other.ativo)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
	
	
	
}

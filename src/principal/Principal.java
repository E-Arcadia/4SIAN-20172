package principal;

import org.hsqldb.Scanner;

import dao.PessoaDAO;
import entidade.Pessoa;
import entidade.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("PEDRO", 
				"SOUZA",
				"ps@souzas.com", 
				"123456789");
		new PessoaDAO().inserir(pf);
		
		
		
		
		
		
		
		for(Pessoa p : new PessoaDAO().listaTudo()) {
			System.out.println(p.toString());
		}
		
		
		
		}

}

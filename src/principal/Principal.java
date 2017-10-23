package principal;

import org.hsqldb.Scanner;

import dao.PessoaDAO;
import entidade.Pessoa;
import entidade.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
		
		//Inserir
		PessoaFisica pf = new PessoaFisica("PEDRO", 
				"SOUZA",
				"ps@souzas.com", 
				"123456789");
		new PessoaDAO().inserir(pf);
		
		
		//Listar	
		for(Pessoa p : new PessoaDAO().listaTudo()) {
			System.out.println(p.toString());
		}
		
		
		// Alterar
		PessoaFisica umaPessoa = new PessoaFisica(3, "JOÃO", 
				"xxxx@souzas.com",
				"xxxxx",
				"123456789");
		new PessoaDAO().alterar(umaPessoa);
		
		//Excluir
		new PessoaDAO().excluir(5);
		
		
		//Listar	
				for(Pessoa p : new PessoaDAO().listaTudo()) {
					System.out.println(p.toString());
				}
		
		}
	
}

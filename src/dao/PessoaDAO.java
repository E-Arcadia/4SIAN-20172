package dao;

import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.CNXHSQLDB;
import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class PessoaDAO {

	public void inserir(Pessoa pessoa) {
		String inserirSQL = "INSERT INTO PESSOA" + "(NOME, SOBRENOME, EMAIL, CPF_CNPJ, PJ_PF )"
				+ "VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = new CNXHSQLDB().conectar(); 
				PreparedStatement pst = conn.prepareStatement(inserirSQL);) {

			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getSobrenome());
			pst.setString(3, pessoa.getEmail());
			if (pessoa instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) pessoa;
				pst.setString(4, pf.getCfp());
				pst.setString(5, "PF");
			} else if (pessoa instanceof PessoaJuridica) {
				PessoaJuridica pj = (PessoaJuridica) pessoa;
				pst.setString(4, pj.getCnpj());
				pst.setString(5, "PJ");
			}
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar o Statment " + e.toString());
		}

	}

	public ArrayList<Pessoa> listaTudo() {
		String SQL_SELECIONA_TUDO = "SELECT * FROM PESSOA";
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

		try (Connection conn = new CNXHSQLDB().conectar();
				PreparedStatement pst = conn.prepareStatement(SQL_SELECIONA_TUDO);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				// , , ,
				String tipo = rs.getString("PJ_PF");

				if (tipo.equals("PF")) {
					PessoaFisica p = new PessoaFisica();
					p.setID(rs.getInt("ID"));
					p.setNome(rs.getString("NOME"));
					p.setSobrenome(rs.getString("SOBRENOME"));
					p.setEmail(rs.getString("EMAIL"));
					p.setCfp(rs.getString("CPF_CNPJ"));
					listaDePessoas.add(p);
				} else if (tipo.equals("PJ")) {
					PessoaJuridica p = new PessoaJuridica();
					p.setID(rs.getInt("ID"));
					p.setNome(rs.getString("NOME"));
					p.setSobrenome(rs.getString("SOBRENOME"));
					p.setEmail(rs.getString("EMAIL"));
					p.setCnpj(rs.getString("CPF_CNPJ"));
					listaDePessoas.add(p);
				}
			}

		} catch (SQLException e) {
			System.out.println("Erro ao executar o Statement" + e.toString());
		}

		return listaDePessoas;
	}

	public void alterar(Pessoa pessoa) {
		String alterarSQL = "UPDATE PESSOA SET NOME=?, SOBRENOME=?, EMAIL=?, CPF_CNPJ=?, PJ_PF=? "
				+ "WHERE ID = ?"
				+ "";
		
		try (Connection conn = new CNXHSQLDB().conectar(); 
				PreparedStatement pst = conn.prepareStatement(alterarSQL);) {

			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getSobrenome());
			pst.setString(3, pessoa.getEmail());
			if (pessoa instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) pessoa;
				pst.setString(4, pf.getCfp());
				pst.setString(5, "PF");
			} else if (pessoa instanceof PessoaJuridica) {
				PessoaJuridica pj = (PessoaJuridica) pessoa;
				pst.setString(4, pj.getCnpj());
				pst.setString(5, "PJ");
			}
			pst.setInt(6, pessoa.getID());
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
		
	}

	public void excluir(int i) {
		String excluirSQL = "DELETE FROM PESSOA WHERE ID = ?";
		
		try (Connection conn = new CNXHSQLDB().conectar(); 
				PreparedStatement pst = conn.prepareStatement(excluirSQL);) {
			pst.setInt(1, i);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
		
	}

}



















package com.esin.pessoa;

import java.util.List;

import com.esin.database.DAOFactory;
import com.esin.pessoa.DAO.PessoaDAO;


public class PessoaRN {

private PessoaDAO dao;
	
	public PessoaRN() {
		this.dao = DAOFactory.criarPessoaDAO();
	}
	
	public Pessoa carregar(String codigo) {
		return this.dao.carregar(codigo);
	}
	
	public void salvar(Pessoa pessoa) {
		this.dao.salvar(pessoa);
	}
	
	public void excluir(Pessoa pessoa) {
		this.dao.excluir(pessoa);
	}
	
	public List<Pessoa> listar(){
		return this.dao.listar();
	}
	
	
}
